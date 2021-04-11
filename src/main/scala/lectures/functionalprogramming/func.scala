package lectures.functionalprogramming

import lectures.functionalprogramming.func.x

/*each function is considered a first class element ,as it implements an instance in the background
* how is scala a functional language ?? -- we can implement scala as a functional language as it gives us features like each value can be declared
as a function ,feactures like hof and curried function help in programmung using only functions
* */
object func extends App{
   val concate:(String) => String=new Function1[String,String] {
     override def apply(v1: String): String = v1+" "
     def start = "hello"
   }



  val addition = new Function1[Int,Function1[Int,Int]]{
    override def apply(x:Int):Function1[Int,Int]=new Function1[Int,Int]  {

      override def apply(y:Int) :Int = x+y
    }

  }

  val add_anonymoss = (x:Int) => (y:Int) => x+y
  val add_anonymoss3:(Int,(Int))=>Int = _ + _

  //val y=(x:Int)=>x
  val add_anaonymos = (x:Int,y:Int)=> x+y
  val add_anaonymos2 :(Int,Int) =>Int = _+_
  println(add_anaonymos(4,5))
  println(add_anonymoss(9)(9))
  println(add_anaonymos2(9,9))
  println(add_anonymoss3(10,20))


  val x= concate("hi")
  val a=addition(3)
  println(a(4))


  val addition2 = new Function1[Int,Function1[Int,Int]] {
    def apply(x:Int):Function1[Int,Int] = new Function1[Int,Int] {
      def apply(y:Int):Int=x+y
    }
  }

  val add3 = new Function1[Int,Function2[Int,Int,Int]] {
    def apply(x:Int):Function2[Int,Int,Int]=new Function2[Int,Int,Int]{
      def apply(y:Int,l:Int):Int=x+y+l
    }
  }

 print(add3(4)(5,6)) //curried implementation of a function and also hOF (func in a func as a parametr )
}
