package lectures.functionalprogramming

object MapFlatMapForcomprehension extends  App {

  val charectars = List('a','b','c')
  val numbers =List(1,2,3)
  val anaonyms=(c:Char,list:List[Int]) => list.map(""+_+c)
  println(charectars.flatMap(anaonyms(_,numbers))) //two loop
  val colors= List("safffron","white","green")
  println(numbers.flatMap(n=>charectars.flatMap(c=>colors.map(x=>""+c+"-"+x+n)))) //three loop

  val concat=for {
    c <- charectars
    n <- numbers
    cl <- colors
  }yield ""+c+n+"_"+cl

  val repeat = 1 to 5
  val repestop= for {
    r <- repeat
  }yield "mango"

  println(concat)
  println(repestop.mkString("!"))
  println(repestop(0))
  repeat.updated(0,10) // update a collection seq,list,vector

  for(i <- repeat)  {println(i)}
}
