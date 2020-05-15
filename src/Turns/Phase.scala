package Turns

import MapLayout.{Location, Tile}

abstract class Phase(gameState: GameState) {
  def moveUnit(unit: Units.Character, destiny: Location): Unit
  def attack(attacker: Units.Character, defender: Units.Character): Unit
  def useItem(user: Units.Character, item: Units.Items.item): Unit
  def heal(healer: Units.Character, target: Units.Character): Unit
  def endTurn(): Unit
}
