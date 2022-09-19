package gradlehelloworld.traits.interfaces

trait HasLegs {
  def startRunning(speed: Double): String
  def runForNSeconds(speed: Double, numSeconds: Int): String

}
