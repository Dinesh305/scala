package lecturespart1basics

object Recursion extends App {
 def factorial(n:Int) :Int={
   if (n==1)
     n
     else{
     n*factorial(n-1)
   }
}
  println(factorial(4))
}
