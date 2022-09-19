package gradlehelloworld.classes.fpstyle.traits

import gradlehelloworld.classes.fpstyle.caseclasses.Pizza
import gradlehelloworld.classes.fpstyle.enums.{CrustSize, CrustType, Topping}

trait PizzaService  extends PizzaServiceInterface {
  override def addTopping(p: Pizza, t: Topping): Pizza = {

    val newToppings = p.toppings :+ t
    p.copy(toppings = newToppings)
  }

  override def removeTopping(p: Pizza, t: Topping): Pizza = {
    val newToppings = p.toppings.filterNot(pt=> pt==t)
    p.copy(toppings = newToppings)
  }

  override def removeAllToppings(p: Pizza): Pizza = ???

  override def updateCrustSize(p: Pizza, cs: CrustSize): Pizza = ???

  override def updateCrustType(p: Pizza, ct: CrustType): Pizza = ???

}
