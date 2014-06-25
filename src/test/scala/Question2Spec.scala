import org.scalatest.{Matchers, FlatSpec}

/**
 * Created by freyja on 6/25/14.
 */
class Question2Spec extends FlatSpec with Matchers {

  it should "return [1,2,3,5,8,13,21,34,55,89] for the first 10 terms" in {
    val fibs = Question2.getFibs(10)

    assert(fibs.equals(List(1,2,3,5,8,13,21,34,55,89)))
  }

}
