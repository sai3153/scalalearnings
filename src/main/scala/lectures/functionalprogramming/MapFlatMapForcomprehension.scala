package lectures.functionalprogramming

object MapFlatMapForcomprehension extends  App {

  val charectars = List('a','b','c')
  val numbers =List(1,2,3)

  print(charectars.flatMap(c=>numbers.map(n=>""+n+c)))

}
