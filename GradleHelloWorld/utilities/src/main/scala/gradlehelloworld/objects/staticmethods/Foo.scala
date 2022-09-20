package gradlehelloworld.objects.staticmethods

class Foo {

  private val secret = 42

  def printObj(): String = s"I can see ${Foo.obj}"

}

object Foo {
  private val obj = "Foo's object"

  def doubleFoo(foo: Foo): Int = foo.secret * 2
}
