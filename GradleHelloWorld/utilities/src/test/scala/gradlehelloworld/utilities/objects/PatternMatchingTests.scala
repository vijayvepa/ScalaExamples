package gradlehelloworld.utilities.objects

import gradlehelloworld.objects.patternmatching.{MatchPerson, Person, PersonServices}
import gradlehelloworld.objects.reify.{AnimalServices, Cat, Dog, DogServices}
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class PatternMatchingTests {

  @Test
  def unapplyTest(): Unit = {
    val p = new Person("Lori", 33)
    val personAsString = Person.unapply(p)

    assertEquals("Lori, 33", personAsString)
  }

  @Test
  def matchingPersonTest(): Unit = {
    val p = new MatchPerson("Lori", 33)

    assertEquals("name: Lori, age: 33", PersonServices.deconstructedPerson(p))
  }

  @Test
  def matchingPersonNullTest(): Unit = {

    assertEquals("null!", PersonServices.deconstructedPerson(null))
  }


}
