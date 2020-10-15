package lectures.part1basics

import scala.annotation.tailrec

/*this recursion is limited as it creates a stack overflow eror for heavy load */
object Recusrion extends App{

  def factorial(number:Int):BigInt={

    if(number==0){
      1
    }
    else{
      number*factorial(number-1)
    }
  }

  //println(factorial(2000))

  /*the below is trying to use tail recursion */
  @tailrec
  def factorial_tc(number:Int,storedvalue:BigInt):BigInt={
    if(number<=1){
      storedvalue
    }
    else {
      factorial_tc(number-1,number*storedvalue) //TAIL RECUSRION -the last line needs to be just a recusrive call
    }

  }
  //println(factorial_tc(50000,1))

  /*example of TC for printing a number n times*/
  @tailrec
  def string_concat(string:String,number:Int,storedvalue:String):String={
    if(number==0){
      storedvalue
    }
    else{
      string_concat(string,number-1,storedvalue+string)
    }
  }
  println(string_concat("chaitanya",5,""))


}

