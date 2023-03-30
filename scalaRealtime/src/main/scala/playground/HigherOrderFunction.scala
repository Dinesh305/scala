package playground

object HigherOrderFunction extends App
{
  def Process(a:Int,b:Int, f:(Int,Int) => Int): Unit = {
    f(a,b)
  val AB =Process(4, 6, (x, y) => x * y)
    return AB

  }

}
