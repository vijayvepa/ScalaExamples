package gradlehelloworld.objects.staticmethods

class Pizza (var crustType: String){


  override def toString = s"Crust type is $crustType"
}

object Pizza{
  val CRUST_TYPE_THIN = "THIN"
  val CRUST_TYPE_THICK = "THICK"
  def getPrice = 0.0
}
