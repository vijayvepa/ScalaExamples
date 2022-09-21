package gradlehelloworld.objects.staticfactory

sealed trait Animal {
  def speak(): String
}

private class Dog extends Animal{
  override def speak(): String = "woof"
}

private class Cat extends Animal{
  override def speak(): String = "meow"
}

object Animal{
  def apply(s: String): Animal = {
    if(s == "dog") {
      return new Dog()
    }
    new Cat()
  }
}