package com.carl

abstract class Food(val name: String) {
  override def toString: String = name

  class Recipe(val name: String, foods: List[Food], val instructions: String)

  object Apple extends Food("apple")

  object Orange extends Food("orange")

  object FruitSalad extends Recipe("fruit salad", List(Apple, Orange), "str it all")

}

trait SimpleFoods {
  this: Food =>

  object Pear extends Food("Pear")

  def allFoods = List(Apple, Pear)

  def allCategories = Nil

  override def toString: String = "hello"
}

class AllFoods extends Food("AllFoods") with SimpleFoods {
  println(allFoods)
}

object SimpleRecipes extends App {
  private val foods = new AllFoods
  println(foods)
}
