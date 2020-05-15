package MapLayout

class wall extends Tile {
  override val passable: Boolean = false
  override val tileType: String = "wall"
  override val bonusProtect: Int = 0
  override val healFor: Int = 0
}
