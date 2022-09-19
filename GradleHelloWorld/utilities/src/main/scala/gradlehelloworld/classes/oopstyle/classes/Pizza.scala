package gradlehelloworld.classes.oopstyle.classes

import gradlehelloworld.classes.fpstyle.enums.{CrustSize, CrustType, Topping}

import scala.collection.mutable.ArrayBuffer

class Pizza
(
  var crustSize: CrustSize,
  var crustType: CrustType,
  var toppings: ArrayBuffer[Topping]

) extends Product{
  def addTopping(t: Topping): Unit = toppings += t
  def removeTopping(t: Topping): Unit = toppings -= t
  def removeAllToppings(): Unit = toppings.clear()
}
