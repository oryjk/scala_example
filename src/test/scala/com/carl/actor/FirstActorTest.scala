package com.carl.actor

import akka.actor.ActorSystem
import akka.testkit.{ImplicitSender, TestKit}
import org.scalatest.{BeforeAndAfterAll, Matchers, WordSpecLike}

class FirstActorTest extends TestKit(ActorSystem("MySpec")) with ImplicitSender
  with WordSpecLike
  with Matchers
  with BeforeAndAfterAll {

  override def afterAll: Unit = {
    TestKit.shutdownActorSystem(system)
  }

  "An Echo actor" must {

    "send back messages unchanged" in {
      val echo = system.actorOf(FirstActor.props)
      echo ! "hello"
      val str = expectMsg("I am FirstActor")
      println(str)
    }

  }

}
