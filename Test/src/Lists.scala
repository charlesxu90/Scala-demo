/**
  * Created by charles on 12/27/15.
  */
class Lists {
  val fruit: List[String] = List("apples", "oranges", "pears")
  val nums : List[Int] = List(1, 2, 3, 4)
  val diag3: List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
  val empty: List[Int] = List()

}

def isort(xs: List[Int]): List[Int] =
  if (xs.isEmpty) Nil
  else insert(xs.head, isort(xs.tail))

def isort(xs: List[Int]): List[Int] = xs match {
  case List() => List()
  case x :: xs1 => insert(x, isort(xs1))
}

def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  case value: List => List(x)
  case y :: ys => if (x <= y) x :: xs else y :: insert(x, ys)
}

def isEmpty: Boolean = this match { case Nil => true
case x :: xs => false
}
def head: A = this match {
  case Nil => error("Nil.head")
  case x :: xs => x }

def tail: List[A] = this match {
  case Nil => error("Nil.tail")
  case x :: xs => xs
}

def length: Int = this match {
  case Nil => 0
  case x :: xs => 1 + xs.length
}

def last: A
def init: List[A]
def last: A = this match {
  case Nil => error("Nil.last") case x :: Nil => x
  case x :: xs => xs.last
}
def take(n: Int): List[A] =
  if (n == 0 || isEmpty) Nil else head :: tail.take(n-1)
def drop(n: Int): List[A] =
  if (n == 0 || isEmpty) this else tail.drop(n-1)
def split(n: Int): (List[A], List[A]) = (take(n), drop(n))
def apply(n: Int): A = drop(n).head

def zip[B](that: List[B]): List[(a,b)] =
  if (this.isEmpty || that.isEmpty) Nil
  else (this.head, that.head) :: (this.tail zip that.tail)