package gradlehelloworld.objects.reify

trait AnimalServices {
  def walk(a:Animal):String = s"$a is walking"
  def run(a: Animal):String = s"$a is running"
  def stop(a:Animal):String = s"$a is stopped"
}

trait TailServices[AnimalWithTail]{
  def wagTail(a: AnimalWithTail) : String = s"$a is wagging tail"
  def stopTail(a: AnimalWithTail): String = s"$a's tail stopped wagging"
}

trait LegServices[AnimalWithLegs]{
  def walk(a: AnimalWthLegs):String = s"$a is walking"
  def run(a: AnimalWthLegs):String = s"$a is running"
  def stop(a: AnimalWthLegs):String = s"$a stopped"
}

trait DogServices[Dog]{
  def bark(d:Dog):String = s"$d says Woof"
}

object AnimalServices extends AnimalServices
object DogServices extends DogServices[Dog] with TailServices[AnimalWithTail] with LegServices[AnimalWthLegs]