package com.carl.list

object QueueApp extends App {

  trait Queue[T] {
    def head: T

    def tail: Queue[T]

    def endQueue(x: T): Queue[T]
  }

//  def doseNotCompile(q: Queue) = {}

}
