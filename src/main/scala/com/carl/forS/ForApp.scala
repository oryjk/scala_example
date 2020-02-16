package com.carl.forS

object ForApp extends App {

  private val value: List[(Int, String)] =
    for (x <- List(1, 2); y <- List("one", "two"))
      yield (x, y)

  println(value)

  private val value1: List[(String, Int)] = for (x <- List("a", "bb", "ccc"); if x.length > 1; c <- 1 to x.length)
    yield (x, c)

  println(value1)


}
