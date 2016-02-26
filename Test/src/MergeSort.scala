/**
  * Created by charles on 12/28/15.
  */
class MergeSort {
  def msort[A](less: (A, A) => Boolean)(xs: List[A]): List[A] = {
    def merge(xs1: List[A], xs2: List[A]): List[A] =
      if (xs1.isEmpty) xs2
      else if (xs2.isEmpty) xs1
      else if (less(xs1.head, xs2.head)) xs1.head :: merge(xs1.tail, xs2)
      else xs2.head :: merge(xs1, xs2.tail)
    val n = xs.length/2
    if (n == 0) xs
    // Merge one half with another
    else merge(msort(less)(xs take n), msort(less)(xs drop n))
  }
  def main(args: Array[String]){
    msort((x: Int, y: Int) => x < y)(List(5, 7, 1, 3))
    val intSort = msort((x: Int, y: Int) => x < y)
    val reverseSort = msort((x: Int, y: Int) => x > y)
  }
}
