package com.carl.list

import scala.collection.mutable.ListBuffer

object ListApp extends App {

  abstract class Fruit

  class Apple extends Fruit

  class Orange extends Fruit

  val apples = new Apple :: Nil

  println(apples)

  val fruits: List[Fruit] = new Orange :: apples

  println(fruits)

  println("------------------------------------")


  val xs = List(1, 2, 3, 4)
  val buf = new ListBuffer[Int]
  for (x <- xs) buf += x + 1
  val list: List[Int] = buf.toList
  println(list)

  def incAll(xs: List[Int]): List[Int] = xs match {
    case List() =>
      println("List()")
      List()
    case x :: xs1 => //这里之所以可以匹配上，是因为解构成 head和tail了，也就是说x是head，xs是tail，head::tail不就是登陆原始的一个list吗，太奇妙了
      println(s"x=$x, xs1=$xs1")
      x + 1 :: incAll(xs1)
  }

  private val incList: List[Int] = incAll(xs)
  println(incList)


}
