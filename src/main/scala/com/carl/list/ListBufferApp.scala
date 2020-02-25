package com.carl.list

import scala.collection.mutable.ListBuffer

object ListBufferApp extends App {

  private val buf = new ListBuffer[Int]()
  buf+=1
  buf+=2
  buf+=3
  buf+=4
  5+=:buf


  Map(1->2)
  println(buf)

  private val list = new ::(1, Nil)

  private val list2: List[Int] = 2 :: list
  println(list2)




}
