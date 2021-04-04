package lectures.part1basics

object CaseClass extends App{

  /*for case classes the parameters are promoted to firelds which lets the obj directly access like fields in
  in normal class ,
  when the variables are parameterized without val they cannot be called by th eobj directly unless val is provided */


 /*they automatically generate equals and hashcode methods ,
 they implement companion objects where new can be avoided as apply method is implemented */
  class students(val name:String,val age:Int) {

 }
  case class Person(  name:String,dob:Int)
  val p= Person("jim",25)
  val p2=new Person("jim",25)
  println(p)
  val x=new students("chaitu",56)
  x.age
  println(p.equals(p2))

}
