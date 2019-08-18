package com.carl.actor

import akka.actor.{Actor, Props}

class FirstActor extends Actor {
  override def receive: Actor.Receive = {
    case msg: String if msg.equals("hello") => sender() ! "I am FirstActor"

  }
}
object FirstActor{
  def props:Props=Props(new FirstActor)
}
