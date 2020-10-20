package lectures.part1basics

object methodNotation extends App {
  val chaitanya =new person("chaitanya","godfather",24)
  println(chaitanya.likes("inception"))
  println((chaitanya+"chaitu")()) //infix
  println((+chaitanya)("sravani")) //apply methods allow to call your objects like functions 
  println(((+chaitanya).age))//prefix

}

class person(val name:String,favmovie:String,val age:Int){

  def likes(favmovie:String)={
    s"$name likes the movie called $favmovie"
  }
  def +(nickname:String):person={ new person(s"$name ($nickname)",favmovie,age)}
  def apply()={
    s"$name likes the movie called $favmovie"
  }

  def apply(name:String)={
    s"the age for $name"
  }

  def unary_+ : person={
    new person(name,favmovie,age+1)
  }

}

