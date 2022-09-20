package gradlehelloworld.utilities.objects


import gradlehelloworld.objects.staticmethods.{Foo, Pizza}
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class StaticMethodTests {

  @Test
  def pizzaWithStaticMethodsTest() : Unit = {
    val p = new Pizza(Pizza.CRUST_TYPE_THIN)
    assertEquals(Pizza.CRUST_TYPE_THIN, p.crustType)
    assertEquals("Crust type is THIN", p.toString)
  }

  @Test
  def accessPrivateMethodsTest(): Unit = {
    val f = new Foo()
    assertEquals(84, Foo.doubleFoo(f))
  }


  @Test
  def accessPrivateMethodsTest2(): Unit = {
    val f = new Foo()
    assertEquals("I can see Foo's object", f.printObj())
  }

}
