package Units.weapons

class SilverLance extends EquipItem {
  override val might: Int = 5
  override val range: Int = 1
  val id: String = "Lance"
  val goodAgainst: String = "Sword"
  override val equipType: String = "weapon"
  override val physical: Boolean = true
}
