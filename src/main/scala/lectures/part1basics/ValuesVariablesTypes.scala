package lectures.part1basics
import scala.collection.mutable.Map
object ValuesVariablesTypes {

  def main(args: Array[String]):Unit = {
    var i = 0
    while (i < 10) {
      println(i)
      i = i + 1
    }

    for (j <- 0 until (10)) {
      println(j)
    }

    // factorial recursive
    def factoril(number:Int):Int={

      if(number>=1) {
        println(number)
        number * factoril(number - 1)
        }
      else{
        println(number)
        1
      }


    }
    println("the factorial value is")
    println(factoril(5))

    //fibonacci without recursion
    def fibonacci(number:Int):Unit={
      var a=0
      var b=1
      println(a)
      println(b)
      for (i<- 2 until(number)){


        //var c= a+b

        var c=a+b
        a = b
        b=c
        println(c)


      }

    }
    println("the fibonacci")
    fibonacci(10)

    /*
    fibonacci with recursion
    */

    val maps:Map[Int,Int]=Map()
    def fib_recursive(number:Int):Int={

      if(maps.contains(number)){
        //println(maps)
        maps(number)
      }

      if(number<=2){
        1
      }
      else{
        val value=fib_recursive(number-1)+fib_recursive(number-2)
        maps+=(number->value)
        //println(maps)
        value}

    }
    println("the fib recursive")

    println(fib_recursive(10))

    /* the above gives the nth fibonacci number*/


    //below prints the fibonacci series till n given number

    /*for (i<-1 until(50)){

      println(s"num:$i :: ${fib_recursive(i)}")

    }*/




  //prime number

    def check_prime(number:Int):Boolean={
      var bool=true
      print(s"check prime for $number ::")

      for (i<-1 until(number+1)){
        if(i!=1 && i!=number && i!=2){
          if(number%i==0)
            //println(number%i)
            bool=false

        }

      }
      bool
    }

    print(s" ${check_prime(2006)}")

  val x="int"+1
    println(x)
    println("abc"+5)


  }
}
