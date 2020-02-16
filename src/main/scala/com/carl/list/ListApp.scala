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

  private val value: List[String] = List("abc", "bcd", "bbb", "ccc", "ddd").dropWhile(_.startsWith("b"))
  println(s""""abc", "bcd", "bbb", "ccc","ddd" dropWhile $value""")

  private val value1: List[Int] = List(1, 2, 3, 4, 5, -1, -2, 3, 4, 5).takeWhile(_ >= 0)
  println(s"1, 2, 3, 4, 5, -1, -2, 3, 4, 5 take while $value1")

  private val value2: List[Int] = List(1, 2, 3, 4, 5, -1, -2, 3, 4, 5).dropWhile(_ >= 0)
  println(s"1, 2, 3, 4, 5, -1, -2, 3, 4, 5 take while $value2")

  private val foldLeftResult: Int = List(1, 2, 3, 4).foldLeft(2)(_ + _)
  println(foldLeftResult)

  //用foldLeft实现一个反转
  private val source = List(1, 2, 3, 4)
  //我们想到得到的结果应该是 List(4,3,2,1)
  private val target: List[Int] = source.foldLeft(List[Int]()) { (x, y) => y :: x }
  println(target)
  //因为foldLeft第一个参数是要构造的对象的类型,所以这里反转的话,还是要一个list,所以这里放一个空的list即可
  //然后第二个参数是函数,返回值是第一个参数的类型

  private val foldRight: List[Int] = source.foldRight(List[Int]()) { (x, y) => x :: y }
  println(foldRight)


}
