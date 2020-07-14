package com.carl.implicitConvert

/**
 * Created by WangRui on 2020/7/14.
 */
object ParameterConvertApp extends App {

  def printDouble(value: Double): Unit = {
    println(s"double value is $value")
  }

  //输入是double类型，不需要任何转换，即可输出
  printDouble(2.0d)

  //输入是int 类型，但是 printDouble 方法只接受double类型的参数，所以会调用隐式转换将int转换为double类型

  implicit def string2Double(value: String): Double = {

    //    value.toDouble 这样写会报错，因为隐式转换只能有一个，Predef
    //    里面已经有一个augmentString转换为StringOps，而StringOps有一个toDouble的方法
    //    而string2Double 也可以把String转换为Double，然后Double也有一个toDouble的方法，所以编译器就懵逼了

    augmentString(value).toDouble
  }

  val value: String = "10"
  //这里拿到一个String类型的value，但是printDouble接受的是double类型，这个时候编译器在编译失败前
  /*回去找是否存在一个隐式转换，将String转换为Double,发现在查找隐式转换作用域范围内可以找到
  string2Double 这样的是一个隐式转换方法可以做这件事情,所以就会先调用string2Double进行一个
  隐式转换,将其转化为double后,在调用 printDouble 方法*/
  printDouble(value)

}
