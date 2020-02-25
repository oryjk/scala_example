package com.carl

/**
 * Created by WangRui on 2020/1/8.
 */
object ConstructApp extends App {

  new B

  new BB

  new CC

}

class A(val name: String) {
  println(s"A name is $name")
}

class B extends {
  override val name: String = "i am B"
} with A(name) {
  println(s"B name is $name")
}


trait AA {
  val name: String = "I am AA"

  println(s"A name is $name")
}

class BB extends AA {
  override val name: String = "I am BB"

  println(s"B name is $name")
}


class CC extends {
  override val name: String = "I am CC"
} with AA {

  println(s"B name is $name")
}
