package lectures.part1basics
/* apply method is declared in teh object with same name as the class ,the apply method should return the class insatnce ,
now what all the args in objects ,can be put in apply and no need for declaring new
--- apply method can be used to create factory methods */
object companionObjects {
  def apply(name: String): companionObjects = new companionObjects(name)

}

object run extends App{
  val runs = companionObjects("ijkh")
  println(runs.name)
}


class companionObjects(val name: String){

}
