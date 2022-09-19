package gradlehelloworld.classes.oopstyle.classes

import scala.collection.mutable.ArrayBuffer

class Order {
  private var lneItems = ArrayBuffer[Product]()

  def addItem(p:Product):Unit = ???
  def removeItem(p:Product):Unit = ???
  def getItems(): Seq[Product] = ???
  def getPrintableReceipt(): String = ???
  def getTotalPrice(): Money = ???



}
