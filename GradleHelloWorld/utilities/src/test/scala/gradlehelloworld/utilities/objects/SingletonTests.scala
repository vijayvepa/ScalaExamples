package gradlehelloworld.utilities.objects

import gradlehelloworld.objects.singleton.{CashRegister, StringUtils}
import org.junit.jupiter.api.Assertions.{assertEquals, assertTrue}
import org.junit.jupiter.api.Test

class SingletonTests {

  @Test
  def cashRegisterOpenTest(): Unit = {
    val open = CashRegister.open()
    assertEquals("opened", open)
  }

  @Test
  def cashRegisterCloseTest(): Unit = {
    val open = CashRegister.close()
    assertEquals("closed", open)
  }

  @Test
  def stringUtilsNullOrEmptyTest(): Unit = {
    assertTrue(StringUtils.isNullOrEmpty(""))
  }

  @Test
  def stringUtilsCapitalizeAllWordsInStringTest(): Unit = {
    val text = StringUtils.capitalizeAllWordsInString("big belly burger")
    assertEquals("Big Belly Burger", text)
  }
}
