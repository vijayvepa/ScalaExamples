package gradlehelloworld.utilities.objects

import gradlehelloworld.objects.factorymethods.Person
import gradlehelloworld.objects.staticfactory.Animal
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StaticFactoryTests {

  @Test
  def staticFactoryUsingApply(): Unit = {
    val cat = Animal("cat")
    val dog = Animal("dog")

    assertEquals("meow", cat.speak())
    assertEquals("woof", dog.speak())
  }

}
