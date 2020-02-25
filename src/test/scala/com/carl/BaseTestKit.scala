package com.carl

import org.scalatest._
import org.scalatestplus.mockito.MockitoSugar

/**
 * 可以统一编写 scala 测试代码的风格
 */
class BaseTestKit extends FlatSpecLike
  with MockitoSugar
  with BeforeAndAfterEach
  with Matchers {

}
