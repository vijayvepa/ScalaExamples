package gradlehelloworld.utilities.traits

import gradlehelloworld.classes.fpstyle.enums.{CrustSize, CrustType, Topping}
import gradlehelloworld.classes.oopstyle.classes.{Order, Pizza}
import gradlehelloworld.traits.intro.Dog
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

class DogTests {

  @Test def testDogInteractions(): Unit = {


    val d = new Dog()
    assertEquals("Woof!", d.speak())
    assertEquals("I'm coming", d.comeToMaster())
    assertEquals("I'm running", d.run())

  }


}
