package src.main.scala.rockjvm

object recursionFunction {

  def main(args: Array[String]): Unit = {


    def recursionFun(str: String, ct: Int): String = {

      if (str == 1) str
      else
        str + recursionFun(str, ct - 1)
    }

    recursionFun("dinesh", 5)


  }
}
