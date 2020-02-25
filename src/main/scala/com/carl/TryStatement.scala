package com.carl

import java.util.concurrent.TimeUnit

object TryStatement extends App {

  def bar: Int = {
    try {
      println("try")
      1000

    }
    finally {
      println("finally")
      1000000
    }
  }

  println(bar)


  def foo: String = {
    try {
      TimeUnit.SECONDS.sleep(2)
    }
    finally {
      "ok"
    }
    "hello"
  }

  println(foo)
  Test.haha()

}


object Test{
  def haha(): Unit ={
    println("test haha")
  }
}