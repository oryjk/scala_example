package com.carl.implicitConvert

object RationalApp extends App {

  println(new Rational(1, 2))

  println(new Rational(1, 2) + new Rational(1, 2))

  println(1 + new Rational(1, 2))

  implicit def int2Rational(x: Int): Rational = {
    new Rational(x, 1)
  }


  implicit def rational2Int(x: Rational): Int = {
    x.x / x.y
  }

}

class Rational(val x: Int, val y: Int) {

  override def toString: String = if (x % y != 0) x + "/" + y else (x / y).toString


  def +(that: Rational): Rational = new Rational(x * that.y + that.x * y, y * that.y)
}
