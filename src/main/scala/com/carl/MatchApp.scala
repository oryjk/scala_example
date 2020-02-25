package com.carl

object MatchApp extends App {

  private val value: Class[String] = classOf[String]
  println(value)
  println(value.getClass)

  //  private val value1: Nothing = Class[String]
  //Error:(9, 33) class java.lang.Class is not a value
  //  private val value1: Nothing = Class[String]


  matchHasIf("hello")
  matchHasIf("world")


  def matchHasIf(input: String): Unit = {

    input match {
      case msg: String if "hello".equals(msg) => println(s"I am hello")
      case msg: String if msg equals "world" => println(s"I am world")
    }

  }
}
