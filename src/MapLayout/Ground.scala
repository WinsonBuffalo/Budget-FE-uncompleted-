package MapLayout

class Ground extends Tile {
  override val passable: Boolean = true
  override val tileType: String = "ground"
  override val bonusProtect: Int = 0
  override val healFor: Int = 0
}
