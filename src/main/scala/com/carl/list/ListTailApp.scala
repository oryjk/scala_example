package com.carl.list

object ListTailApp extends App {

  private val list = List(1, 2, 3)

  private val tail: List[Int] =list.tail
  println(tail)

}
