import scala.collection.immutable.IndexedSeq

/**
 * Created by freyja on 6/25/14.
 */
object Question1 {
  def getSumOfMultiplesOfThreeAndFive(end: Int): Int = getMultiplesOfThreeAndFive(end).sum


  def getMultiplesOfThreeAndFive(end: Int): IndexedSeq[Int] = {
    val range = 1 until end

    range.filter(n => n % 3 == 0 || n % 5 == 0)
  }

}
