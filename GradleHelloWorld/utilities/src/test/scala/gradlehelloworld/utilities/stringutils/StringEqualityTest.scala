package gradlehelloworld.utilities.stringutils

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class StringEqualityTest {

  val helloCapitalCase1 = "Hello"
  val helloCapitalCase2 = "Hello"
  val helloConcatenated: String = "H" + "ello"
  val nullString: String = null
  val hello = "hello"

  @Test def testStringEquality(): Unit = {
    assertEquals(helloCapitalCase1, helloCapitalCase2)
    assertEquals(helloCapitalCase2, helloConcatenated)
  }

  @Test def testNullStrings(): Unit = {
    assertNotEquals(nullString, helloCapitalCase1)
    assertNotEquals(nullString, helloCapitalCase2)
    assertNotEquals(nullString, helloConcatenated)
  }

  @Test def testToUpperCase(): Unit = {
    assertEquals(helloCapitalCase1.toUpperCase, hello.toUpperCase)
  }

  @Test def testEqualsIgnoreCase(): Unit = {
    assertTrue(helloCapitalCase2.equalsIgnoreCase(hello))
  }

  @Test def testEqualOperator() : Unit = {
    assertTrue(helloCapitalCase1 == helloCapitalCase2)
    assertFalse(helloCapitalCase1 == nullString)
  }

  //noinspection ScalaUnusedExpression
  @Test def testWhenMethodCalledOnNullThenThrowsNPE(): Unit = {

     try {
       nullString.toUpperCase()
       fail("No exception thrown")


     } catch {
       case e:NullPointerException =>
         assertNull( e.getMessage)
     }
  }

}
