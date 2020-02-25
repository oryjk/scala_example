package com.carl.list

import scala.collection.mutable

object SetApp extends App {

  private val value = Set(42)
  println(value)
  private val value1: mutable.Set[Int] = scala.collection.mutable.Set.empty ++ value
  value1.add(1)
  value1.add(2)
  value1.add(3)
  println(value1)
}
