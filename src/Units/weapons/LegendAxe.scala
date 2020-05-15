package Units.weapons

class LegendAxe extends EquipItem {
  override val might: Int = 9
  override val range: Int = 2
  val id: String = "Axe"
  val goodAgainst: String = "Lance"
  override val equipType: String = "weapon"
  override val physical: Boolean = true
}
