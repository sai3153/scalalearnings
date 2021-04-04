package lectures.excercises

abstract class MyList {
  def head :Int
  def tail:MyList
  def isEmpty:Boolean
  def add(element:Int):MyList
  def printelements:String

  override def toString: String = "["+printelements+"]"
}

case object Empty extends MyList {
  def head:Int=throw new NoSuchElementException
  def tail:MyList=throw new NoSuchElementException

  override def isEmpty: Boolean = true

  override def add(element: Int): MyList = new nonEmpty(element,Empty)
  def printelements:String =""
}

case class nonEmpty(h:Int,t:MyList) extends MyList {
  def head:Int=h
  def tail:MyList=t

  override def isEmpty: Boolean = false
  def add(element:Int):MyList=new nonEmpty(element,this)
  def printelements:String = if(t.isEmpty) ""+h  else h+" "+t.printelements
}

object linkedList extends App {
   val list=Empty.add(1)
   val list2=new nonEmpty(2,new nonEmpty(3,new nonEmpty(4,Empty)))
   println(list.head+" "+list2.tail.head +"   "+list2.toString)

}
