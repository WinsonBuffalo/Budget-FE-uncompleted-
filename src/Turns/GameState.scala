package Turns

import MapLayout.{Location}

class GameState {
  var phase: Phase = new playerPhase(this)
  val playerUnits: List[Units.Character]= List()
  val enemyUnits: List[Units.Character]= List()
  def moveUnit(unit: Units.Character, path: Location): Unit={
    phase.moveUnit(unit, path)
  }
  def attack(attacker: Units.Character, defender: Units.Character): Unit={
    phase.attack(attacker,defender)
  }
  def useItem(user: Units.Character, item: Units.Items.item): Unit={
    phase.useItem(user, item)
  }
  def heal(healer: Units.Character, target: Units.Character): Unit={
    phase.heal(healer,target)
  }

}
