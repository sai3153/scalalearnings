object Attempttwo extends App {
  def fibonacci(number:Int,helper:Int,before_last:Int,last:Int):Int={

    if(helper>=number){
      last
    }
    else{
      fibonacci(number,helper+1,last,before_last+last)
    }


  }
  println(fibonacci(10,2,1,1))
  new abc("chaitanya").name
}

case class abc(name:String){

}

