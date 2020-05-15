package MapLayout

object EntireMap {
  val G: Tile = new Ground
  val W :Tile = new wall
  val H: Tile = new healTile
  val F: Tile = new Forest
  val theMap: List[List[Tile]] = List(
    List(G,G,G,G,G,G,G,G,G,G,G,G,G,G,G),
    List(G,G,G,G,G,G,G,H,G,G,G,G,G,G,G),
    List(G,G,G,G,G,G,G,G,G,G,G,G,G,G,G),
    List(G,G,F,F,F,G,G,G,G,G,F,F,F,G,G),
    List(G,G,F,F,F,G,G,G,G,G,F,F,F,G,G),
    List(G,G,G,G,G,G,G,G,G,G,G,G,G,G,G),
    List(G,G,G,G,G,G,G,G,G,G,G,G,G,G,G),
    List(G,G,G,W,W,W,G,G,G,W,W,W,G,G,G),
    List(G,G,G,W,G,G,G,G,G,G,G,W,G,G,G),
    List(G,G,G,W,G,G,H,H,H,G,G,W,G,G,G)
  )
  def main(args: Array[String]): Unit = {
    print("this is all I have now")
  }
}
