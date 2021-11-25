package DS

// Scala program to create a ListBuffer
// ListBuffer class is imported
import scala.collection.mutable.ListBuffer

// Creating object
object GfG
{

  // Main Method
  def main(args: Array[String])
  {
    // Instance of ListBuffer is created
    var name = ListBuffer[String]()
    name += "GeeksForGeeks"
    name += "gfg"
    name += "Class"
    println(name)
  }
}
