package gradlehelloworld.utilities.controlstructures

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

import scala.collection.mutable

class ForLoopWithMultipleCounters {

  @Test def testTwoDimensions(): Unit = {

    val stringBuilder = new mutable.StringBuilder()

    for( i <- 1 to 2 ; j <- 1 to 2){
      val item = s"i = $i, j= $j,"
      stringBuilder.append(item)
    }

    val text=  stringBuilder.toString()
    assertEquals("i = 1, j= 1,i = 1, j= 2,i = 2, j= 1,i = 2, j= 2,", text)
  }

  @Test def testThreeDimensions(): Unit = {

    val stringBuilder = new mutable.StringBuilder()

    for (
      i <- 1 to 3;
      j <- 1 to 5;
      k <- 1 to 10 by 2

    ) {
      val item = s"$i-$j-$k,"
      stringBuilder.append(item)
    }

    val text = stringBuilder.toString()
    assertEquals("1-1-1,1-1-3,1-1-5,1-1-7,1-1-9," +
      "1-2-1,1-2-3,1-2-5,1-2-7,1-2-9," +
      "1-3-1,1-3-3,1-3-5,1-3-7,1-3-9," +
      "1-4-1,1-4-3,1-4-5,1-4-7,1-4-9," +
      "1-5-1,1-5-3,1-5-5,1-5-7,1-5-9," +
      "2-1-1,2-1-3,2-1-5,2-1-7,2-1-9," +
      "2-2-1,2-2-3,2-2-5,2-2-7,2-2-9," +
      "2-3-1,2-3-3,2-3-5,2-3-7,2-3-9," +
      "2-4-1,2-4-3,2-4-5,2-4-7,2-4-9," +
      "2-5-1,2-5-3,2-5-5,2-5-7,2-5-9," +
      "3-1-1,3-1-3,3-1-5,3-1-7,3-1-9," +
      "3-2-1,3-2-3,3-2-5,3-2-7,3-2-9," +
      "3-3-1,3-3-3,3-3-5,3-3-7,3-3-9," +
      "3-4-1,3-4-3,3-4-5,3-4-7,3-4-9," +
      "3-5-1,3-5-3,3-5-5,3-5-7,3-5-9,", text)
  }

  @Test def testArrayDim: Unit = {
    val a = Array.ofDim[Int](2,2)
    a(0)(0) = 0
    a(0)(1) = 1
    a(1)(0) = 2
    a(1)(1) = 3

    val stringBuilder = new mutable.StringBuilder()

    for(
      i <- 0 to 1;
      j <- 0 to 1
    ){
      stringBuilder.append(s"($i)($j):${a(i)(j)},")
    }

    assertEquals("(0)(0):0,(0)(1):1,(1)(0):2,(1)(1):3,", stringBuilder.toString())
  }

}
