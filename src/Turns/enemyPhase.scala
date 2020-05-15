package Turns

import MapLayout.Location
import Units.Items.item

class enemyPhase(gameState: GameState) extends Phase(gameState) {
  override def moveUnit(unit: Units.Character, destiny: Location): Unit = {
  }
  override def attack(attacker: Units.Character, defender: Units.Character): Unit = {
  }
  override def useItem(user: Units.Character, item: item): Unit = {
  }
  override def heal(healer: Units.Character, target: Units.Character): Unit = {
  }
  override def endTurn(): Unit = {
    gameState.phase = new playerPhase(gameState)
  }

  for(playerUnit <- gameState.playerUnits){
    playerUnit.moveable = true
    playerUnit.actionReady = true
  }

  gameState.phase = new playerPhase(gameState)


}
