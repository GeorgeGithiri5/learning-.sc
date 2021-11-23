package OOP

class Inheritance {
  var Parents: String = "Father And Mother"
}

class Children extends Inheritance{
  var Sibling: String = "Child 1, Child 2, Child 3"

  def family(){
    println("Parents: " + Parents)
    println("Sibling: " + Sibling)
  }
}

object Main{
  def main(args: Array[String]){
    val ob = new Children();
    ob.family();
  }
}