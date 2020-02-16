package com.carl

/**
 * 实验一下，伴生对象中的的val对应的方法是否会执行, 实验结果是会执行的
 */
object InitialApp extends App {

  new Apple

}


class Apple {

  import Apple._

  name
}

object Apple {

  val name :IndexedSeq[Int]= buildName


  private def buildName = {
    (1 to 5).map { i =>
      println(s"i = $i")
      i * i
    }
  }
}
