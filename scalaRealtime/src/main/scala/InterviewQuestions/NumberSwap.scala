package src.main.scala.InterviewQuestions

object NumberSwap {

  def main(args: Array[String]): Unit = {
    println("Swapping Number")

    var a = 10;
    var b = 20;
    println("Before swapping " + a + ", " + b)

//    var temp = a //temp =10
//    a=b
//    b= temp //b =10
//    println(a,b)

    a= a+b //10+20=30
    b=a-b //30-20=10
    a=a-b // 30-10=20

    println("After swapping " + a + ", " + b)

  }
}
