package gradlehelloworld.utilities.objects

import gradlehelloworld.objects.reify.{AnimalServices, Cat, Dog, DogServices}
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class ReifyTests {

  @Test
  def reifyAnimalTest(): Unit = {

    val zeus: Dog = Dog("zeus")
    val catZeus: Cat = Cat("zeus")

    val walk: String = AnimalServices.walk(zeus)
    assertEquals("Dog(zeus) is walking", walk)

    val runCat: String = AnimalServices.run(catZeus)
    assertEquals("Cat(zeus) is running", runCat)

    val stopDog: String = AnimalServices.stop(zeus)
    assertEquals("Dog(zeus) is stopped", stopDog)
  }

  @Test
  def reifyDogTest(): Unit = {
    val rocky: Dog = Dog("rocky")

    val walk = DogServices.walk(rocky)
    assertEquals("Dog(rocky) is walking", walk)

    val bark = DogServices.bark(rocky)
    assertEquals("Dog(rocky) says Woof", bark)
  }

}
