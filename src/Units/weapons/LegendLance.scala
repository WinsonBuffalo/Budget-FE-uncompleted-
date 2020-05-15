package Units.weapons

class LegendLance extends EquipItem {
  override val might: Int = 9
  override val range: Int = 2
  val id: String = "Lance"
  val goodAgainst: String = "Sword"
  override val equipType: String = "weapon"
  override val physical: Boolean = true
}
