package lectures.part1basics

object absatrcat extends App {
    val sp=new sports {
      override def run(name: String): String = "hihi"
    }

    println(sp.run(sp.name)+" "+sp.purpose+" "+sp.behavior)
}

abstract class shoes(val name:String) {
  def run(name:String):String

}

trait running {

  def purpose:String
  def behavior :String={
    "running"
  }
}

class sports extends shoes("nike") with running {
  def run(name:String):String={
    name
  }

  override def purpose: String = {"used for"}
}