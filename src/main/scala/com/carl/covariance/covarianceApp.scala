package com.carl.covariance

object covarianceApp extends App {
  private val queue: Queue[Int] = new StrangeIntQueue
//  private val queue: Queue[Any] = new StrangeIntQueue // 这样是无法编译通过的,因为不支持协变
  queue.endQueue(2)
}

trait Queue[T] {
  def endQueue(x: T): Unit
}

class StrangeIntQueue extends Queue[Int] {
  override def endQueue(x: Int): Unit = {
    val d = math.sqrt(x)
    println(d)
  }
}

//trait QueueC[+T] {
//  def endQueue(x: T): Unit //这里也是编译不通过的,因为协变的参数类型,不能作为任何方法的参数,这里的T就是协变的参数类型
//}
//
//class StrangeIntQueueC extends QueueC[Int] {
//  override def endQueue(x: Int): Unit = {
//    val d = math.sqrt(x)
//    println(d)
//  }
//}
