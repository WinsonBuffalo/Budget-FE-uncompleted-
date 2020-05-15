package Units.weapons

class SilverAxe extends EquipItem {
  override val might: Int = 5
  override val range: Int = 1
  val id: String = "Axe"
  val goodAgainst: String = "Lance"
  override val equipType: String = "weapon"
  override val physical: Boolean = true
}
