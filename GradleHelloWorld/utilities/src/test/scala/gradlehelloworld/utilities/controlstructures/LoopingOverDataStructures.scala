package gradlehelloworld.utilities.controlstructures

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import scala.collection.mutable

class LoopingOverDataStructures {

  @Test def testIterateOverList(): Unit = {

    val fruits = List("apple", "banana", "orange")

    val stringBuilder = new mutable.StringBuilder()
    for (f <- fruits) {
      stringBuilder.append(f).append(",")
    }

    assertEquals("apple,banana,orange,", stringBuilder.toString())
  }

  @Test def testIterateOverListWithForeach(): Unit = {

    val fruits = List("apple", "banana", "orange")

    val stringBuilder = new mutable.StringBuilder()
    fruits.foreach(stringBuilder.append)

    //noinspection SpellCheckingInspection
    assertEquals("applebananaorange", stringBuilder.toString())
  }

  @Test def testIterateOverListWithForeachLambda(): Unit = {

    val fruits = List("apple", "banana", "orange")

    val stringBuilder = new mutable.StringBuilder()
    fruits.foreach(e=> stringBuilder.append(e.toUpperCase() + ", "))


    assertEquals("APPLE, BANANA, ORANGE, ", stringBuilder.toString())
  }

  @Test def testIterateOverListWithForeachLambdaMulti(): Unit = {

    val fruits = List("apple", "banana", "orange")

    val stringBuilder = new mutable.StringBuilder()
    fruits.foreach(e => {
      val upper = e.toUpperCase
      stringBuilder.append(s"$upper, ")
    })


    assertEquals("APPLE, BANANA, ORANGE, ", stringBuilder.toString())
  }

  @Test def testIterateOverListWithIndex(): Unit = {

    val fruits = List("apple", "banana", "orange")

    val stringBuilder = new mutable.StringBuilder()
    //noinspection RangeToIndices
    for (i <- 0 until fruits.length) {
      stringBuilder.append(s"$i is ${fruits{i}}, ")
    }

    assertEquals("0 is apple, 1 is banana, 2 is orange, ", stringBuilder.toString())
  }


  @Test def testIterateOverListWithIndices(): Unit = {

    val fruits = List("apple", "banana", "orange")

    val stringBuilder = new mutable.StringBuilder()
    for (i <- fruits.indices) {
      stringBuilder.append(s"$i is ${
        fruits {
          i
        }
      }, ")
    }

    assertEquals("0 is apple, 1 is banana, 2 is orange, ", stringBuilder.toString())
  }

  @Test def testIterateOverListWithZippedIndex(): Unit = {

    val fruits = List("apple", "banana", "orange")

    val stringBuilder = new mutable.StringBuilder()
    for ((fruit, index) <- fruits.zipWithIndex) {
      stringBuilder.append(s"$index is $fruit, ")
    }

    assertEquals("0 is apple, 1 is banana, 2 is orange, ", stringBuilder.toString())
  }

  @Test def testIterateOverRange(): Unit = {


    val stringBuilder = new mutable.StringBuilder()
    for (index <- 1 to 3) {
      stringBuilder.append(s"$index, ")
    }

    assertEquals("1, 2, 3, ", stringBuilder.toString())
  }

  @Test def testIterateOverMap(): Unit = {

    val names = Map(
      "firstname" -> "Robert",
      "lastName" ->  "Goren"
    )

    val stringBuilder = new mutable.StringBuilder()

    for( (k,v)<- names){
      stringBuilder.append(s"$k: $v, ")
    }

    assertEquals("firstname: Robert, lastName: Goren, ", stringBuilder.toString())
  }

  @Test def testWhileLoop(): Unit = {

    var i=0

    val stringBuilder = new mutable.StringBuilder()

    while(i< 3){
      stringBuilder.append(s"$i, ")
      i += 1
    }

    assertEquals("0, 1, 2, ", stringBuilder.toString())
  }

}
