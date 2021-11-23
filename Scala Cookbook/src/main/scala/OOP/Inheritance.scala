package OOP

class Inheritance {
  var Languages: String = "Java, Scala, GO, Javascript"
}

class Libraries extends Inheritance
{
  var library: String = "React js, Spring Boot"

  def details(){
    println("Languages: " + Languages)
    println("library: " + library)
  }
}

object Main{
  def main(args: Array[String]){
    val ob = new Libraries();
    ob.details();
  }
}