package lectures.functionalprogramming

import scala.util.Random

object learnOptions extends App{
    val address :Map [String,String] = Map("ip" -> "19.119.34.44","port" -> "78")
    val ip = address("ip")
    val port = address("port")
    val myFirstoption : Option[Int]= Some(25)
  /*println(myFirstoption.map(_*4))
  println(myFirstoption.filter(_ >29))
  println(myFirstoption.flatMap(x =>Option(x*1)))
  */

  println(Connection(ip,port))

  class Connection {
    def connect()="connected"

  }

  object Connection{
    val random = scala.util.Random
    //println(random)
    def apply(ip:String,port:String): Option[String] = {
      if(random.nextInt() % 2 == 0 ) Some(new Connection().connect()) else None
    }
  }
  

}


