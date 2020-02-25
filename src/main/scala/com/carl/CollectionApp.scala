package com.carl

/**
 * Created by WangRui on 2020/1/8.
 */
object CollectionApp extends App {

  println(Set(List(1, 2), Set(3, 4), Set(3, 4, 5)).map { x =>
    x.size
  }.sum)

  println(List(List(3, 4),Set(1, 2)).map(_.size).sum)


}
