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
