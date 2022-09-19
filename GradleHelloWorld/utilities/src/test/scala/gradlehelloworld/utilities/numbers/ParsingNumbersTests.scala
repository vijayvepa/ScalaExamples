package gradlehelloworld.utilities.numbers

import gradlehelloworld.utilities.NumberUtils
import org.junit.jupiter.api.Assertions.{assertEquals, assertThrows}
import org.junit.jupiter.api.Test

class ParsingNumbersTests {

  @Test def testStringToByte(): Unit ={

    def byte1: Byte = "1".toByte
    assertEquals(1, byte1)
  }

  @Test def testStringToShort(): Unit = {

    def short1: Short = "1".toShort

    assertEquals(1, short1)
  }

  @Test def testStringToInt(): Unit = {

    def int1: Int = "1".toInt

    assertEquals(1, int1)
  }

  @Test def testStringToLong(): Unit = {

    def long1: Long = "1".toLong

    assertEquals(1, long1)
  }

  @Test def testStringToFloat(): Unit = {

    def float1: Float = "1".toFloat

    assertEquals(1, float1)
    assertEquals(1.0, float1)
  }

  @Test def testStringToDouble(): Unit = {

    def double1: Double = "1".toDouble

    assertEquals(1, double1)
    assertEquals(1.0, double1)
  }

  @Test def testStringToBigInt(): Unit = {

    def BigInt1: BigInt = BigInt("1")

    assertEquals(BigInt(1), BigInt1)
  }

  @Test def testStringToBigDecimal(): Unit = {

    def BigDecimal1: BigDecimal = BigDecimal("1.234")

    assertEquals(BigDecimal(1.234), BigDecimal1)
  }

  @Test def testNumberFormatException(): Unit ={

    assertThrows(classOf[NumberFormatException], () => "hello!".toInt)
  }

  @Test def testNumberFormatExceptionBigInt(): Unit = {

    assertThrows(classOf[NumberFormatException], () => BigInt("hello!"))
  }

  @Test def testRadix2(): Unit = {
    assertEquals(1, Integer.parseInt("1", 2))
    assertEquals(2, Integer.parseInt("10", 2))
    assertEquals(3, Integer.parseInt("11", 2))
    assertEquals(4, Integer.parseInt("100", 2))
  }

  @Test def tryParseInt1_whenNumber_returnsNumber() : Unit = {
    assertEquals(Option(1), NumberUtils.tryParseIntOption("1"))
  }

  @Test def tryParseInt1_whenNotANumber_returnsNone(): Unit = {
    //noinspection AssertBetweenInconvertibleTypes
    assertEquals(None, NumberUtils.tryParseIntOption("test"))
  }

  @Test def tryParseInt2_whenNumber_returnsNumber(): Unit = {
    assertEquals(Option(1), NumberUtils.tryParseIntOptionWithTry("1"))
  }

  @Test def tryParseInt2_whenNotANumber_returnsNone(): Unit = {
    //noinspection AssertBetweenInconvertibleTypes
    assertEquals(None, NumberUtils.tryParseIntOptionWithTry("test"))
  }
}
