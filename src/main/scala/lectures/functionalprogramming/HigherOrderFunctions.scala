package lectures.functionalprogramming

object HigherOrderFunctions extends  App {
      val firstfunc: Int=>Int = (x:Int) => x*2

      def secfunc(f:(Int)=>Int,x:Int)={
        f(x)
      }

     println(secfunc(firstfunc,3))
}
