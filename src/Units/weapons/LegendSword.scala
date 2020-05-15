package Units.weapons

class LegendSword extends EquipItem {
  override val might: Int = 9
  override val range: Int = 2
  val id: String = "Sword"
  val goodAgainst: String = "Axe"
  override val equipType: String = "weapon"
  override val physical: Boolean = true
}
