package gradlehelloworld.objects.reify

trait Animal
trait AnimalWthLegs
trait AnimalWithTail

case class Dog(name: String) extends Animal with AnimalWthLegs with AnimalWithTail
case class Cat(name: String) extends Animal with AnimalWthLegs with AnimalWithTail