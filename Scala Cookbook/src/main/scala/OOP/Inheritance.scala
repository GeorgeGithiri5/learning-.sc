package OOP

class Inheritance {
  var Name: String = "Ankita"
}

class Child extends Inheritance{
  var Age: Int = 22

  def details(){
    println("Name: " + Name)
    println("Age: " + Age)
  }
}

object Main{
  def main(args: Array[String]){
    val ob = new Child();
    ob.details();
  }
}
