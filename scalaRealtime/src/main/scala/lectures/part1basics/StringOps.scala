package lecturespart1basics

object StringOps extends  App{

  val str: String = "Hello this is dinesh"

  println(str.charAt(1))

  val abc = (str.split(" ").toList)

  println(abc)
//Remove specific string from list
  println(abc.patch(1,List.empty,1))


}
