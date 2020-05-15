package Units.weapons

class IronLance extends EquipItem {
  override val might: Int = 3
  override val range: Int = 1
  val id: String = "Lance"
  val goodAgainst: String = "Sword"
  override val equipType: String = "weapon"
  override val physical: Boolean = true
}
