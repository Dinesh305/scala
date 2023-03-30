package lecturespart1basics

object CallByValueCallByName extends App{
  def callByName(x: => Int) ={
    println("deposited CallByName " +x)
    println("deposited CallByName " + x)
    println("deposited CallByName " +x)
  }
  var amt = 0
  callByName{amt+=1;amt}

  def callByValue(x: Int) = {
    println("deposited callByValue " + x)
    println("deposited callByValue " + x)
    println("deposited callByValue " + x)
  }

  var amt1 = 0
  callByValue {
    amt1 += 1; amt1
  }
}
