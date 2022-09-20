package gradlehelloworld.objects.factorymethods

class Person private(val name: String, val age:Int) {
  override def toString: String = {
    if(age == 0)
      name
    else
      s"$name($age years old)"
  }

}

object Person {
  def apply(): Person = new Person("", 0)
  def apply(name: String): Person = new Person(name, 0)
  def apply(name: String, age: Int) = new Person(name, age)
  def apply(tuple: (String, Int)) = new Person(tuple._1, tuple._2)
  def apply(tuples: (String, Int)*): Seq[Person] = {
    for(t <- tuples)
      yield new Person(t._1, t._2)
  }
}