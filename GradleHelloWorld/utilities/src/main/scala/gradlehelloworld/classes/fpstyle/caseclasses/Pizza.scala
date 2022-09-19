package gradlehelloworld.classes.fpstyle.caseclasses

import gradlehelloworld.classes.fpstyle.enums.{CrustSize, CrustType, Topping, Toppings}

case class Pizza
(
  crustSize: CrustSize,
  crustType: CrustType,
  toppings: Seq[Topping]
)
