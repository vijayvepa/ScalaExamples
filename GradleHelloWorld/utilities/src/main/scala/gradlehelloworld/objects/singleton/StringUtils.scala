package gradlehelloworld.objects.singleton

object StringUtils {


  def isNullOrEmpty(s: String): Boolean = s == null || s.trim.equals("")

  def leftTrim(s: String): String = s.replaceAll("^\\s+", "")

  def rightTrim(s: String): String = s.replaceAll("^\\s+$", "")

  def capitalizeAllWordsInString(s: String): String = s.split(" ").map(_.capitalize).mkString(" ")

}
