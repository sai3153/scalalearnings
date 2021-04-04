package lectures.functionalprogramming
//HOF using recursive strategy
object ntimes extends App {

   val plusone = (x:Int) =>x+1
    def ntimes(f:Int => Int,n:Int,init:Int):Int ={
      if (n<0) init
      else ntimes(f,n-1,f(init))
    }
  println(ntimes(plusone,10,0))
}
