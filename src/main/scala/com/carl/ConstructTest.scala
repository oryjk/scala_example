package com.carl

object ConstructTest extends App {

  new A

}

class A {
  val name: String = "hello"
  println(name)
}
