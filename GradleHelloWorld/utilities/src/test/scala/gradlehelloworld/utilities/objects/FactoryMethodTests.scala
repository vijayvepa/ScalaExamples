package gradlehelloworld.utilities.objects

import gradlehelloworld.objects.factorymethods.Person
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FactoryMethodTests {

  @Test
  def factoryMethodUsingApplyTest(): Unit = {
    val regina = Person("Regina")
    assertEquals("Regina", regina.name)
    assertEquals("Regina", regina.toString)
  }

  @Test
  def factoryMethodListUsingApplyTest(): Unit = {
    val people = List( Person("Regina"), Person("Robert"))
    assertEquals("Regina", people.head.toString)
    assertEquals("Robert", people(1).toString())
  }

  @Test
  def factoryMethodUsingNameAndAgeTest(): Unit = {
    val regina22 = Person("Regina", 22)
    assertEquals("Regina(22 years old)", regina22.toString)
  }

  @Test
  def factoryMethodUsingTupleTest(): Unit = {
    val regina22 = Person(("Regina", 22))
    assertEquals("Regina(22 years old)", regina22.toString)
  }

  @Test
  def factoryMethodUsingTuplesTest(): Unit = {
    val people = Person(("Regina", 22), ("Cheryl", 31))
    assertEquals("Regina(22 years old)", people.head.toString)
    assertEquals("Cheryl(31 years old)", people(1).toString)
  }
}
