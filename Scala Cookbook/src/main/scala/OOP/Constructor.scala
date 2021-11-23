package OOP

class Constructor(Aname: String, Cname: String)
{
  var no: Int = 0;
  def display()
  {
    println("Author name: " + Aname)
    println("Chapter name: " + Cname)
    println("total number of articles: " + no)
  }

  def this(Aname: String, Cname: String, no: Int){
    this(Aname, Cname)
    this.no = no
  }
}

object Main{
  def main(args: Array[String]){
    var obj = new Constructor("Anya", "Constructor", 34)
    obj.display();
  }
}