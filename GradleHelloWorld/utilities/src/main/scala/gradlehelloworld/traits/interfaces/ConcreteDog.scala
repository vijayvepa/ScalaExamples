package gradlehelloworld.traits.interfaces

class ConcreteDog extends AbstractDog {
  override def startRunning(speed: Double): String = s"Running at $speed mph"

  override def startTail(): String = "Tail is wagging"

  override def stopTail(): String = "Tail stopped"

  override def runForNSeconds(speed: Double, numSeconds: Int): String = s"Running at $speed mph for $numSeconds seconds"

}
