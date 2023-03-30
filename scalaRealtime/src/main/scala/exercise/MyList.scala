package exercise

import sun.security.krb5.internal.APOptions

abstract class MyList {
  def head:Int
  def tails:MyList
  def isEmpty:Boolean
  def add(element:Int):MyList

}

object Empty extends MyList{
  override def head: Int = throw new  NoSuchElementException()
  override def tails: MyList = throw new  NoSuchElementException()
  override def isEmpty: Boolean = true
  override def add(element: Int): MyList = new Cons(element,Empty)
}

class Cons(h:Int,t:MyList) extends MyList {
  override def head: Int = h
  override def tails: MyList = t

  override def isEmpty: Boolean = false

  override def add(element: Int): MyList = new Cons(element, this)
}
  object ListTest extends App(){

    val list = new Cons(1,Empty)

    println(list.head)
  }
