package gradlehelloworld.traits.intro

class Dog extends Pet with HasLegs {

  override def speak(): String = "Woof!"

  override def comeToMaster(): String = "I'm coming"
}
