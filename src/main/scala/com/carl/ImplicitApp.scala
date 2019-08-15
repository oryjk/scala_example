package com.carl

object ImplicitApp extends App {

//  implicit val exposure: Double = 1.00 如果去掉注释是跑步起来的，原因是由于编译器无法判断用哪一个隐式参数
  implicit val exposur2: Double = 2.00

  def run()(implicit exposure: Double): Unit = {
    println(exposure)
  }

  run()

}
