package src.main.scala.InterviewQuestions

object PositiveOrNegative {
  def main(args: Array[String]) {
      var num: Int = 0;

      print("Enter number:")
      num = scala.io.StdIn.readInt()

      if (num >= 0)
        println("Number is POSITIVE")
      else
        println("Number is NEGATIVE")
    }
  }

