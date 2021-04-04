package lectures.part1basics

object Exptn extends App {

  exception("cvhjvcj")
  class exce extends RuntimeException
  def exception(name:String)={
    try{if (name.isInstanceOf[String]){
      throw new Exception("this is a string")
    }}

    //try{2%0}
    catch{
      case e:Exception=>println(s"$e")
    }
    finally {
      println("done")
    }

  }
}

