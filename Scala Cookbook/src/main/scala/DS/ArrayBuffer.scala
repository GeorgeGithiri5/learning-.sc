package DS

import scala.collection.mutable.ArrayBuffer

object ArrayBufferObj
{
  def main(args: Array[String]): Unit =
  {
    var name = ArrayBuffer[String]()
    name += "GeeksForGeeks"
    name += "gfg"
    name += "Chandan"

    println(name(1))
  }
}
