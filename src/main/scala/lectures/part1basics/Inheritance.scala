package lectures.part1basics

object Inheritance extends App {

//val lion=new Animals()
//lion.eatinghabits()
  val tiger:Animals=new carnivores("tiger")
  tiger.eatinghabits()
  val dog=new Dog
  println(dog.Isapet())
  println(dog.Isapet("bruno"))
  val lion:AllAnimalsArenotPets=new lion
  println(lion.Isitpet("biggboy"))
  //println(lion.note)
  val animallist:covarlist[Animalsss]=new covarlist[dog]

}

class covarlist[+A]
class Animalsss{

}

class dog extends Animalsss{

}

class cat extends Animalsss


 sealed  class Animals {
  def eatinghabits()={
    println("few eat flesh few eat plants")
  }
}

 class carnivores(val name:String) extends Animals{
  super.eatinghabits()
  override def eatinghabits(): Unit = {
    println(s"they eat fleash for example : $name")
  }
}

abstract class Pets(name:String){
  def Isapet(name:String):String
}

trait Petsanimals{
  def Isapet():String={s"Hi pets"}
}

trait AllAnimalsArenotPets {
  def Isitpet(name:String):String
  def define={"hie all "}
}

class Dog extends Pets("dog") with Petsanimals with AllAnimalsArenotPets {
  def Isapet(name:String):String={
    val x=s"$name is a pet"
    x
  }
  def Isitpet(name:String):String={s"Hi $name is not a pet"}
}

class lion extends AllAnimalsArenotPets with Petsanimals  {
  def Isitpet(name:String):String={s"Hi $name is not a pet"}
  def note="these stay in forest "
}

