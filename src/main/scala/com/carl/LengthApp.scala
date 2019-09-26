package com.carl

object LengthApp extends App {

  private val length: Int = "hello".length.toString.length
  println(length)

  List("hello", "world", "wang", "rui")
    .reduceLeft((a, b) => {
      if (a.length > b.length) a else b
    })

}
