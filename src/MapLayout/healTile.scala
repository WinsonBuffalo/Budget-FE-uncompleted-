package MapLayout

class healTile extends Tile {
  override val passable: Boolean = true
  override val tileType: String = "healTile"
  override val bonusProtect: Int = 1
  override val healFor: Int = 5
}
