package OOP

class Polymorphism {
  def func(vehicle: String, category: String){
    println("The vehicle is: " + vehicle)
    println("The vehicle category is: " + category)
  }

  def func(name: String, Marks: Int){
    println("Student Name is: " + name)
    println("Marks obtained are: " + Marks)
  }
  def func(a: Int, b: Int){
    var Sum = a + b;
    println("Sum is: " + Sum)
  }
}

//object Main{
//  def main(args: Array[String]){
//    var A = new Polymorphism();
//    A.func("Swift", "hatchback");
//    A.func("honda-city","sedan")
//    A.func("Ashok", 95)
//    A.func(10,20)
//  }
//}
