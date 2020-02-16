package com.carl.list

object ArrayApp extends App {

  val a1=Array("abc")
  println(a1)

  private val a2: Array[Any] = a1.asInstanceOf[Array[Any]]
  println(a2)
  a2(0)=1
  println(a2)

}
