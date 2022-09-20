package gradlehelloworld.utilities.objects

import org.junit.jupiter.api.Assertions.{assertEquals, assertNotNull}
import org.junit.jupiter.api.Test

import java.lang.reflect.Method

class PassingClassTypeTests {

  @Test
  def classOfTest(): Unit = {
    val stringClass = classOf[String]
    val methods: Array[Method] = stringClass.getMethods
    assertNotNull(methods)
    assertEquals(90, methods.length)
  }

}
