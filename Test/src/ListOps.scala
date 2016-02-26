/**
  * Created by charles on 12/28/15.
  */
class ListOps {
  def scaleList(xs: List[Double], factor: Double): List[Double] = xs match {
    case Nil => xs
    case x :: xs1 => x * factor :: scaleList(xs1, factor)
  }
}

abstract class List2[A] {
  def map[B](f: A =>B): List2[B] = this match {
    case Nil => this
    case x :: xs => f(x) :: xs.map(f)
  }
}
