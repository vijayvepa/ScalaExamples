package gradlehelloworld.traits.interfaces

class Dog extends HasLegs with HasTail  with HasRubberyNose {

  override def startRunning(speed: Double): String = s"Running at $speed mph"

  override def startTail(): String = "Tail is wagging"

  override def stopTail(): String = "Tail stopped"

  override def runForNSeconds(speed: Double, numSeconds: Int): String = s"Running at $speed mph for $numSeconds seconds"
}
