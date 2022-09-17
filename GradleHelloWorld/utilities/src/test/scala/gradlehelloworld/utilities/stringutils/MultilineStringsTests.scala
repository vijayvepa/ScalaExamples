package gradlehelloworld.utilities.stringutils

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class MultilineStringsTests {
  val multilineString =
    """This is
      a multiline
      string"""

  val multilineStringWithPipes: String =
    """
      |Four score and
      |seven years ago
      |""".stripMargin

  val multilineStringToSingleLine: String =
    """Four score and
      |seven years ago
      |our fathers....""".stripMargin.replaceAll(System.lineSeparator(), " ")

  val multilineStringWithQuotationMarks: String =
    """This is known as a
      |"multiline" string
      |or 'heredoc' syntax.
      |""".stripMargin.replaceAll(System.lineSeparator(), " ")


  //region Multiline Strings

  //noinspection ScalaRedundantConversion
  @Test def testMultiWithoutPipes(): Unit = {

    assertEquals(
      "This is\n      a multiline\n      string".replaceAll("\n", System.lineSeparator()).toString,  multilineString
    )
  }


  //noinspection ScalaRedundantConversion
  @Test def testMultiWithPipes(): Unit = {

    assertEquals("\nFour score and\nseven years ago\n".replace("\n", System.lineSeparator()).toString, multilineStringWithPipes)
  }

  //noinspection ScalaRedundantConversion
  @Test def testMultiWithLineReplacement(): Unit = {

    assertEquals("Four score and seven years ago our fathers....", multilineStringToSingleLine)
  }

  @Test def testMultiWithQuotationMarks(): Unit = {

    assertEquals("This is known as a \"multiline\" string or 'heredoc' syntax. ", multilineStringWithQuotationMarks)
  }

  //endregion
}
