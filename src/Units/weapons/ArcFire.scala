package Units.weapons

class ArcFire extends EquipItem {
  override val might: Int = 5
  override val range: Int = 2
  val id: String = "Magical"
  val goodAgainst: String = null
  override val equipType: String = "weapon"
  override val physical: Boolean = false
}
