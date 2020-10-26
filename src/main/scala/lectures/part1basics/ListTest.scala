package lectures.part1basics

object ListTest extends App {
    val list=new cons(1,new cons(2,new cons(3,Empty)))
    println(list.head)
    println(list.tail.head)

}

abstract class  MyList {

  def head:Int
  def tail:MyList
  def isEmpty:Boolean
  def add(element:Int):MyList
}

object Empty extends MyList{
  def head=throw new NumberFormatException
  def tail =throw new NumberFormatException
  def isEmpty=false
  def add(element:Int)=new cons(element,Empty)
}

class cons(h:Int,t:MyList) extends MyList{
  def head=h
  def tail=t

  def isEmpty: Boolean = true
  def add(element:Int)=new cons(element,this)
}

