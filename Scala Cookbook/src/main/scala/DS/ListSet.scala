package DS

// Scala program to Initialize a ListSet
import scala.collection.immutable._

// Creating object
object GFGG
{
  // Main method
  def main(args:Array[String])
  {
    println("Initializing an immutable ListSet ")

    // Creating ListSet
    val listSet1: ListSet[String] = ListSet("GeeksForGeeks",
      "Article", "Scala")
    println(s"Elements of listSet1 = $listSet1")
  }
}
