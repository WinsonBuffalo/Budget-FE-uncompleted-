package MapLayout

abstract class Tile {
  val passable: Boolean
  val tileType: String
  val bonusProtect: Int
  val healFor: Int

}
