package gradlehelloworld.objects.patternmatching

trait PersonServices[MatchPerson] {


  def deconstructedPerson(p: MatchPerson): String = p match {
    case MatchPerson(a, n) => s"name: $n, age: $a"
    case null => "null!"
  }
}

object PersonServices extends PersonServices[MatchPerson]