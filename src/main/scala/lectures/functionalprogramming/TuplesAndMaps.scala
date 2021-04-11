package lectures.functionalprogramming

object TuplesAndMaps extends App {
      val tuple =("a","b")
      println(tuple.toString())
      println(tuple.copy(_1="hggh"))
      tuple.swap
      val map:Map[String,Int] = Map.empty
      val map1=Map(("a" ->1),("b",2)) + ("abb"->3) //a is updated
      println(map1.mapValues(_+""+"."))
      println(map1.filterKeys(_.charAt(0)=='a'))
      println(map1.filter(_._1.charAt(0)=='a'))
      println(map1.map(_._2*4))
      val map2 = map1.map(_._1.toUpperCase -> 3).map(_._1.toLowerCase -> 3)
      println(map2+("A" -> 10))

      val groupby = List("chaitanya","charit","chetan","raju","seshu")
      val grpbyans=groupby.groupBy(_.charAt(0)).values.toList.flatMap( onj => onj).filter(_.startsWith("c"))
      println(grpbyans)
}
