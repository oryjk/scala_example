package com.carl.actor

import akka.actor.{Actor, ActorSystem, Props}
import akka.testkit.{ImplicitSender, TestKit}
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}

class InnerActorTest extends TestKit(ActorSystem("MySpec")) with ImplicitSender
  with WordSpecLike
  with Matchers
  with BeforeAndAfterAll {

  override def afterAll: Unit = {
    TestKit.shutdownActorSystem(system)
  }

  "An Echo actor" must {

    "send back messages unchanged" in {
      val echo = system.actorOf(InnerActor.props)
      echo ! "hello"
      val str = expectMsg("I am InnerActor")
      println(str)
    }

  }

}

class InnerActor extends Actor {
  override def receive: Actor.Receive = {
    case msg: String if msg.equals("hello") => sender() ! "I am InnerActor"

  }
}

object InnerActor {
  def props: Props = Props(new InnerActor)
}

