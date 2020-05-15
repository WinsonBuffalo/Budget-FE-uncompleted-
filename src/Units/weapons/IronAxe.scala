package Units.weapons

class IronAxe extends EquipItem {
  override val might: Int = 3
  override val range: Int = 1
  val id: String = "Axe"
  val goodAgainst: String = "Lance"
  override val equipType: String = "weapon"
  override val physical: Boolean = true
}
