package MapLayout

class Forest extends Tile{
  override val passable: Boolean = true
  override val tileType: String ="Forest"
  override val bonusProtect: Int = 2
  override val healFor: Int = 0
}
