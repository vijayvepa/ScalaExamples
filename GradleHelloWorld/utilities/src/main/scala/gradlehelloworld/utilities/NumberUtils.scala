package gradlehelloworld.utilities
import scala.util.Try

object NumberUtils {

  @throws(classOf[NumberFormatException])
  def parseInt(s:String): Int = s.toInt

  def tryParseIntOption(s: String): Option[Int] =  {
      try {
        Some(s.toInt)
      } catch {
        case e: NumberFormatException => None
      }
  }

  def tryParseIntOptionWithTry(s: String): Option[Int] = Try(s.toInt).toOption
}
