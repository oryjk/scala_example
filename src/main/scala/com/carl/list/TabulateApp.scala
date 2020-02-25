package com.carl.list

object TabulateApp extends App {

  private val value: List[List[Int]] = List.tabulate(3, 3) { (x, y) => {
    println(s"x=$x, y=$y")
    x + y
  }
  }

  println(value)

  private val list1 = List(1, 2, 3)
  private val list2 = List(4, 5, 6)
  println(list1.toString())
  println(list2.hashCode())

  private val result: List[Int] = List.concat(list1, list2)
  println(result.hashCode())
  println(result)


  //forall方法是所有的条件都必须要是true,就返回true,要不然就返回false,和exist刚好相反
  private val bool: Boolean = (List("abc", "ab"), List(3, 2)).zipped.forall { (x, y) => x.length == y }
  println(bool)

}
