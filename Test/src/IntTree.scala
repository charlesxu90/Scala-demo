import sun.jvm.hotspot.utilities.IntervalTree

import scala.Int

/**
  * Created by charles on 12/27/15.
  */
abstract class IntTree {
  def contains(t: IntTree, v: Int): Boolean = t match {
    case (t: EmptyTree, v: Int) => false
    case (t: Node, v: Int) => {
      if (t.elem == v) true
      else if (t.elem < v) contains(t.left, v)
      else contains(t.right, v)
    }
  }

  def insert(t: IntTree, v: Int): IntTree = t match {
    case (t: Node, v: Int) => {
      if (t.elem <= v) insert(t.left, v)
      else insert(t.right, v)
    }
    case (t: EmptyTree, v: Int) => new Node(v, null, null)
  }
}
case class EmptyTree(tree: IntTree) extends IntTree
/**
  if (tree is null)
}
  */
case class Node(elem: Int, left: IntTree, right: IntTree) extends IntTree


