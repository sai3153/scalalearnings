package lectures.part1basics

object ListTest extends App {
    val list=new cons(1,new cons(2,new cons(3,Empty)))
    println(list.head)
    println(list.tail.head)
   val obj:Animal =new Animal{
     println("anc")
   }
  val integers:MyList[Int]=new cons(1,new cons(2,new cons(3,Empty)))
  val strings:MyList[String]=new cons("abc",new cons("bhf",Empty))
  println(integers.toString)
  println(strings.toString)




}

abstract class  MyList[+A] {

  def head:A
  def tail:MyList[A]
  def isEmpty:Boolean
  def add[B>:A](element:B):MyList[B]
  def printer:String
  override def toString: String = "["+ printer + "]"
}

object Empty extends MyList[Nothing]{
  def head:Nothing=throw new NumberFormatException
  def tail:MyList[Nothing] =throw new NumberFormatException
  def isEmpty=false
  def add[B>:Nothing](element:B):MyList[B]=new cons(element,Empty)
  def printer:String=""

}

class cons[+A](h:A,t:MyList[A]) extends MyList[A]{
  def head=h
  def tail=t

  def isEmpty: Boolean = true
  def add[B>:A](element:B):MyList[B]=new cons(element,this)
  def printer:String={
    if(t.isEmpty) {
      ""+h
    }
    else{ h+" "+t.printer}

  }
}

abstract  class Animal{
  println("BC")
}

