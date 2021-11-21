package OOP

class Test {
  var number: Int = 16
  var nameOfCompany: String= "Apple"

  def Display(){
    println("Name of company :" + nameOfCompany);
    println("total number of smartphone generation: " + number)
  }
}

object Main{
  def main(args: Array[String]){
    var obj = new Test();
    obj.Display()
  }
}
