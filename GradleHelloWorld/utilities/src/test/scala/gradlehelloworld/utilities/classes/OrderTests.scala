package gradlehelloworld.utilities.classes


import gradlehelloworld.classes.oopstyle.classes.Pizza
import gradlehelloworld.classes.fpstyle.enums.{CrustSize, CrustType, Topping, Toppings}
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import scala.collection.mutable
import gradlehelloworld.classes.oopstyle.classes.Order

import scala.collection.mutable.ArrayBuffer

class OrderTests {

  @Test def testIterateOverList(): Unit = {

    val order = new Order()
    order.addItem(new Pizza(CrustSize.Small, CrustType.Thin, ArrayBuffer(Topping.Cheese, Topping.Pepperoni)))

  }


}
