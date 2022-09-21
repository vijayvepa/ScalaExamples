package gradlehelloworld.objects.patternmatching

class MatchPerson (val name:String, val age: Int)
object MatchPerson{
  def unapply(p: MatchPerson): Option[(Int, String)] = Some(p.age, p.name)

}
