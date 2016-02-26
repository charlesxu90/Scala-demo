/**
  * Created by charles on 12/27/15.
  */
abstract class Set [A]{
  def incl(x: A): Set[A]
  def contains(x: A): Boolean
}

def contains(x: Int): Boolean =
  if (x < elem ) left contains x

trait Ordered[A] {
  /** Result of comparing ‘this’ with operand ‘that’.
    * returns ‘x’ where
    * x<0 iff this < that
    * x == 0 iff this == that
    * x > 0 iff this > that
    */

  def compare(that: A): Int

  def <(that: A): Boolean = (this compare that) < 0

  def >(that: A): Boolean = (this compare that) > 0

  def <=(that: A): Boolean = (this compare that) <= 0

  def >=(that: A): Boolean = (this compare that) >= 0

  def ompareTo(that: A): Int = compare(that)
}


