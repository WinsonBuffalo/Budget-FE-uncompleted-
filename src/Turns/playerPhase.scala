package Turns

import MapLayout.{EntireMap, Location, Tile}
import Units.Items.item

class playerPhase(gameState: GameState) extends Phase(gameState){
  override def moveUnit(unit: Units.Character, destination: Location): Unit = {
    if (gameState.playerUnits.contains(unit) && unit.moveable && EntireMap.theMap(destination.y)(destination.x).passable){
      unit.moveTo(destination)
    }
  }
  override def attack(attacker: Units.Character, defender: Units.Character): Unit = {
    if (gameState.playerUnits.contains(attacker)){
      if (attacker.equip.equipType != "staff"){
        var count: Boolean = true
        if (attacker.equip.range> defender.equip.range){
          count = false
        }
        var double: Boolean = false
        var doubler: Units.Character = attacker
        if(attacker.speed> (defender.speed+4)){
          double = true
        } else if (defender.speed>(attacker.speed+4)){
          double = true
          doubler = defender
        } else {
        }
        defender.attacked(attacker, count,double,doubler)
        attacker.actionReady == false
      }
    }
  }
  override def useItem(user: Units.Character, item: item): Unit = {
    if (gameState.playerUnits.contains(user)){
      user.useItem(user.itemsList, item)
    }
  }
  override def heal(healer: Units.Character, target: Units.Character): Unit = {
    if (gameState.playerUnits.contains(healer) && gameState.playerUnits.contains(target)){
      if (healer.equip.equipType =="staff"){
        target.healed(healer.magic + healer.equip.might)
        healer.actionReady == false
      }
    }
  }
  override def endTurn(): Unit = {
    gameState.phase = new enemyPhase(gameState)
  }
}
