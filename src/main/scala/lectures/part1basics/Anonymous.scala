package lectures.part1basics

/*this for implementing a anonymous class
* anoanyms class is like creating an object for a pre defined class/abstract class  and reintsantiating  a new object
* both the implementations are executed --1)the predefined one is instantiated   2)the anonymous one is instantiated */

/*when an anonymous class is instaiated the class anonymous extends the classname gets implemented*/
object Anonymous extends App{
    val anon1=new Animalss{
      override def eat: String = super.eat
    }
  val anon2=new Lion {
    override def eat: String = super.eat
  }
  println(anon1.eat)
  println(anon2.eat)
}

class Animalss{
  print("bye")
  def eat="animals eat"
}

abstract class Lion{
  println("hie")
  def eat="lion is an animla"
}
