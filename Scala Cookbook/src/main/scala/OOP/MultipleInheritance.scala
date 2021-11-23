package OOP

class MultipleInheritance {
  var Name: String = "George"
}

class Child1 extends MultipleInheritance{
  var Age: Int = 32
}

class Child2 extends Child1{
  def details(){
    println("Name: " + Name)
    println("Age: " + Age)
  }
}

object Main{
  def main(args: Array[String]): Unit ={
    val ob = new Child2();
    ob.details();
  }
}