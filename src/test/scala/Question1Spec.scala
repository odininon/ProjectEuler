/**
 * Created by freyja on 6/25/14.
 */

import org.scalatest._

class Question1Spec extends FlatSpec with Matchers {

  it should "return [3,5,6,9]" in {
    val values = Question1.getMultiplesOfThreeAndFive(10)

    assert(values.equals(List(3,5,6,9)))
  }

  it should "sum up to 23" in {
   val sum = Question1.getSumOfMultiplesOfThreeAndFive(10)

   assert(sum == 23)
  }

}
