package gradlehelloworld.objects.patternmatching

class Person (val name: String, val age: Int)
object Person{
  def unapply(p:Person):String = s"${p.name}, ${p.age}"
}
