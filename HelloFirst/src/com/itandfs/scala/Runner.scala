package com.itandfs.scala

/**
  * Created by kreddy on 3/30/16.
  */
object Runner {
  def main(args: Array[String]) {
    println("Hello First App ...");
    var str = "hello World";
    println(str.length)
    str.filter(_ != 'l').foreach(println);
    for(c <- str) println(c);
    println(str.toUpperCase)

    str =
      """Hello 123
        |adfafafa
        |dafafa
        |dafafadfa
      """.stripMargin;
    println(str);
    val regex = "[0-9]+".r;
    var address = "3710 Broadrun Dr,fairfax, va-22033";
    var housenumber = regex.findFirstIn(address);
    housenumber.foreach(println)
    var housearray = housenumber.toArray
    println(housearray(0))
    val pattern = "([0-9]+) ([A-Za-z]+) ([A-Za-z]+)".r
    val pattern(count, fruit1, fruit2) = "100 Bananas apples"
    println(fruit2)
  }
}
