import scala.collection.immutable.IndexedSeq

/**
 * Created by freyja on 6/25/14.
 */
object Question2 {

  val fibs:Stream[BigInt] = BigInt(1) #:: BigInt(2) #:: fibs.zip(fibs.tail).map { n => n._1 + n._2}

  def getFibs(terms: Int) = fibs take terms toIndexedSeq

}
