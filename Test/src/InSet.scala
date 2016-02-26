/**
  * Created by charles on 12/27/15.
  */
abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def excl(x: Int): IntSet
  def isEmpty: Boolean
}
/*
trait IntSet{
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
}
*/
class EmptySet extends IntSet {
  def contains(x: Int): Boolean = false
  def isEmpty: Boolean = true
  def incl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
  def excl(x: Int): IntSet = new NonEmptySet(x, new EmptySet, new EmptySet)
}

class NonEmptySet(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true

  def incl(x: Int): IntSet =
    if (x < elem) new NonEmptySet(elem, left incl x, right)
    else if (x > elem) new NonEmptySet(elem, left, right incl x)
    else this

}
