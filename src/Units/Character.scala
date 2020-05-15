package Units

import MapLayout.{EntireMap, Location, Tile}
import Units.Items._
import Units.weapons.EquipItem

class Character(val HP: Int, var strength: Int, var magic: Int, var speed: Int, var defense: Int, var resist: Int, val move: Int, val equip: EquipItem, var placement: Location) {
  var currentHP: Int = HP
  var standing: Boolean = true
  var actionReady: Boolean = true
  var moveable: Boolean= true
  var itemsList: List[item] = List()
  var standTile: Tile = EntireMap.theMap(placement.y)(placement.x)
  def attacked(enemy: Character, counter: Boolean, double: Boolean, doubler: Character): Unit={
    var defensive: Int = standTile.bonusProtect
    var damage: Int = enemy.equip.might
    if(enemy.equip.physical){
      damage+=enemy.strength
      defensive+=defense
    }else{
      damage+=enemy.magic
      defensive+=resist
    }
    var dealt: Int = damage- defensive
    if(dealt<0){
      dealt = 0
    }
    currentHP -= dealt
    if(currentHP <= 0){
      standing = false
    }
    if(standing){
      if(counter){
        if (double && doubler == this){
          enemy.attacked(this, false, true, this)
        }else{
          enemy.attacked(this, false, false, this)
        }
      }
      if (double && doubler == enemy && enemy.standing){
        currentHP -= dealt
      }
    }
    if(currentHP <= 0){
      standing = false
    }
  }
  def HPLimit(addToHP: Int): Unit={
    currentHP+= addToHP
    if(currentHP > HP){
      currentHP = HP
    }
  }
  def useItem(listOfItems: List[item], select: item): Unit={
    if (listOfItems.contains(select)){
      if (select.stat == "HP"){
        this.HPLimit(select.addition)
      }
      if (select.stat == "strength"){
        strength += select.addition
      }
      if (select.stat == "magic"){
        magic += select.addition
      }
      if (select.stat == "speed"){
        speed += select.addition
      }
      if (select.stat == "defense"){
        defense += select.addition
      }
      if (select.stat == "resist"){
        resist += select.addition
      }
      itemsList = itemsList.filter(_!=select)
      actionReady = false
    }
  }

  def healed(plusToHP: Int): Unit={
    this.HPLimit(plusToHP)
  }
  def moveTo(destination: Location): Unit={
    val xMove: Int = (placement.x - destination.x).abs
    val yMove: Int = (placement.y - destination.y).abs
    if (yMove+xMove<=move){
      placement = destination
      moveable = false
    }
  }
  def tradeWith(trader: Character, traded: item): Unit={
    trader.itemsList = trader.itemsList :+ traded
    itemsList = itemsList.filter(_!=traded)
  }
}
