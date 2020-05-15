package Units.weapons

class SilverSword extends EquipItem {
  override val might: Int = 5
  override val range: Int = 1
  val id: String = "Sword"
  val goodAgainst: String = "Axe"
  override val equipType: String = "weapon"
  override val physical: Boolean = true
}
