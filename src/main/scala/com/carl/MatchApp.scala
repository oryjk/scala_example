package com.carl

object MatchApp extends App {

  private val value: Class[String] = classOf[String]
  println(value)
  println(value.getClass)

  //  private val value1: Nothing = Class[String]
  //Error:(9, 33) class java.lang.Class is not a value
  //  private val value1: Nothing = Class[String]

}
