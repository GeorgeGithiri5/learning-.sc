package OOP

class SingletonObject {
  var length = 20;
  var height = 40;

  def area(){
    var ar = length*height
    println("Area: " + ar)
  }
}

object Main{
  def main(args: Array[String]){
    var obj = new SingletonObject();
    obj.area();
  }
}
