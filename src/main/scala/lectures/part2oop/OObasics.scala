package lectures.part2oop

object OObasics extends App {
    val obj=new Person("chaitanya",25,"cycling")
    obj.specifications(name="harish",age = 20)
     obj.specifications(age = 30)
   val writer=new Writer("sai","chaitanya",1996)
  println(writer.fullname())
  val novel=new Novel("igikai",2020,"sai chiatnaya")
  println(s"the authoirs age is ${novel.authorAge(writer.dob)}")
  println(s"${novel.name} is written by ${novel.iswrittenBy()}")
  val novel2=novel.copy(2021)
  println(novel2.authorAge(writer.dob))

  val counter =new counter(100)
  println(s"the current count is ${counter.currentcount()}")
  println(s"the increament is ${counter.increment().number}")
  println(s"the decrement is ${counter.decrement().number}")
  println(s"increament by amount is ${counter.increment(20)}")
  println(s"the decrement by amount us ${counter.decrement(30)}")

}

class Person(name:String,age:Int,sport:String){
  /*there is difference btwn class parametr and class field :when you place val in class parameter
  ts class field and can be accessed by instantiating object */
  def specifications(name:String,age:Int): Unit ={
    val x=s" $name  says ${this.name}   is of age $age"
    println(x)
  }
  //overloading
  def specifications(age:Int): Unit ={
    val x=s" $name  says ${this.name}   is of age $age"
    println(x)
  }
}

class Writer(firstname:String,surname:String,val dob:Int){
  def fullname()={firstname+surname}
}

class Novel(val name:String,val year0frelease:Int,author:String){
  def authorAge(dob:Int)={year0frelease-dob}
  def iswrittenBy()={author}
  def copy(newyearofrelease:Int):Novel={new Novel(name,newyearofrelease,author)}
}

class counter(val number:Int){
  def currentcount()=number
  def increment()={new counter(number+1)}
  def decrement()={new counter(number-1)}
  def increment(amount:Int)={number+amount}
  def decrement(amount:Int)={number-amount}
}