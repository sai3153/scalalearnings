package lectures.part1basics

object functions extends App {

  def fibonacci(number:Int):Int={
    if (number <= 2) 1
    else fibonacci(number-1)+fibonacci(number-2)

  }
  //println(fibonacci(10))

  def fibnocci_tr(number:Int,iterator:Int,last:Int,last_bef:Int):Int={
       if (number <=2) 1
       else if(number > iterator) fibnocci_tr(number,iterator+1,last+last_bef,last)
       else last
  }
  println(fibnocci_tr(10,1,1,0))

  def isprime_te(number:Int,div:Int): String ={
    if (number % div == 0) "notprime"
    else if(div <= 10 && div < number) {
      isprime_te(number,div+1)
    }
    else "prime"
  }
  println(isprime_te(21,2))
}
