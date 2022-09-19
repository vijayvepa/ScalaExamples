package gradlehelloworld.classes.fpstyle.traits

import gradlehelloworld.classes.fpstyle.caseclasses.Pizza
import gradlehelloworld.classes.fpstyle.enums.{CrustSize, CrustType, Topping}

trait PizzaServiceInterface {
  def addTopping(p: Pizza, t: Topping): Pizza
  def removeTopping(p: Pizza, t:Topping): Pizza
  def removeAllToppings(p:Pizza): Pizza
  def updateCrustSize(p: Pizza, cs: CrustSize): Pizza
  def updateCrustType(p: Pizza, ct: CrustType): Pizza

}
