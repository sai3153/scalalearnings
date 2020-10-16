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

  @tailrec
  def Isprime_tc(number:Int,storedvalue:Int):Boolean={
    if(number==1 || number==2){
      true
    }
    if(storedvalue<number/2)
      if(number%storedvalue==0)
        {false}

       else {
        Isprime_tc(number,storedvalue+1)
      }
    else{
      true
    }
  }

  println(s"this is isprime in tail recursion ${Isprime_tc(400017,2)}")

  /*the below tail recursion is for fibonacci series */

 @tailrec
  def fibonacci_tr(number:Int,iterator:Int,before_last:Int,last:Int):Int={
    if(number<=2) 1
    if(iterator<number){
      fibonacci_tr(number,iterator+1,last,last+before_last)
    }
    else last

  }

  println(s"the fibonacci tr ::: ${fibonacci_tr(8,2,1,1)}")

  /*call by name vs cllaby value
  * call by value the parameter passed is evaluated only once
  * in call by value the parameter is evaluated every time the function is called
  * */

  def callbyvalue(n:Int):Int={
    n
  }
  def callbyname(x: => Long):Long={
    x
    callbyname(x)
  }

  //println(callbyname(System.nanoTime()))
  //println(callbyvalue(1))

  /*example of call by name ->even when its an infinaite loop it does not get evaluated as we are not using it in the output
  * else for call  by value its a infinite loop occurence as it gets evaluated */

  def infinite():Int=1+infinite()
  def callbyname(x:Int,y: => Int)=println(x)
  //println(callbyname(1,infinite()))

  val list:List[String]=List("a","b","c")
  println(list.isInstanceOf[Seq[String]])

}

