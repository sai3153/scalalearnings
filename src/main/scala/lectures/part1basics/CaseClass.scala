package lectures.part1basics

object CaseClass extends App{

  /*for case classes the parameters are promoted to firelds which lets the obj directly access like fields in
  in normal class ,
  when the variables are parameterized without val they cannot be called by th eobj directly unless val is provided */


 /*they automatically generate equals and hashcode methods ,
 they implement companion objects where new can be avoided as apply method is implemented */

  case class Person(name:String,dob:Int)
  val p=new Person("jim",1996)
  val p2=new Person("chai",25)
  println(p)
  println(p.equals(p2))

}
