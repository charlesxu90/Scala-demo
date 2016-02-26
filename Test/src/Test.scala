/**
  * Created by charles on 12/27/15.
  */
object Test {

  def id(x: Int): Int = x
  def square(x: Int): Int = x * x
  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)


  def sum(f: Int => Int, a: Int, b: Int): Int = if (a > b) 0 else f(a) + sum(f, a + 1, b)
  /*
  def sumInts(a: Int, b: Int): Int = sum(id, a, b)
  def sumSquares(a: Int, b: Int): Int = sum(square, a, b)
  def sumPowersOfTwo(a: Int, b: Int): Int = sum(powerOfTwo, a, b)

  def id(x: Int): Int = x
  def square(x: Int): Int = x * x
  def powerOfTwo(x: Int): Int = if (x == 0) 1 else 2 * powerOfTwo(x - 1)
*/

  // anonymous functions
  /*
  def sumInts(a: Int, b: Int): Int = sum((x: Int) => x, a, b)
  def sumSquares(a: Int, b: Int): Int = sum((x: Int) => x * x, a, b)
*/
  // omit parentheses
  /*
  def sumInts(a: Int, b: Int): Int = sum((x: Int) => x, a, b)
  def sumSquares(a: Int, b: Int): Int = sum((x: Int) => x * x, a, b)
*/

  // (x1: T1, ..., xn: Tn) => E
  // is equivalent to
  // { def f (x1: T1, ..., xn: Tn) = E ; f _ }


  // 5.2 Currying
  def sum(f: Int => Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int =
      if (a > b) 0 else f(a) + sumF(a + 1, b)
    sumF
  }

  /*
  def sumInts = sum(x => x)
  def sumSquares = sum(x => x * x)
  def sumPowersOfTwo = sum(powerOfTwo)
  */
/*
  val sumInts = sum(x => x)
  val sumSquares = sum(x => x * x)
  val sumPowersOfTwo = sum(powerOfTwo)
*/
  /*
  def sum(f: Int => Int)(a: Int, b: Int): Int =
    if (a > b) 0 else f(a) + sum(f)(a + 1, b)
*/
  /*
  Generally, a curried function definition
    def f (args1) ... (argsn) = E
  where n > 1 expands to
    def f (args1) ... (argsn°1) = { def g (argsn) = E ; g }
  where g is a fresh identifier. Or, shorter, using an anonymous function:
    def f (args1) ... (argsn°1) = ( argsn ) => E .
  Performing this step n times yields that
    def f (args1) ... (argsn) = E
  is equivalent to
    def f = (args1) => ... => (argsn) => E .
  Or, equivalently, using a value definition:
    val f = (args1) => ... => (argsn) => E .
  */

  def product(a:Int, b:Int):Int =
    if (a > b) 1 else a * product(a + 1, b)

  def main (args: Array[String]): Unit = {
    //println(sumSquares(1, 10) + sumPowersOfTwo(10, 20))
    println(product(3, 5))
  }
}


def power(x: Double, n: Int): Double = { var r = 1.0
  var i = n
  var j = 0
  while (j < 32) {
    r=r*r
    if (i < 0)
      r *= x
    i = i << 1
    println(i)
    println(j)
    println(r)
    j += 1
  }
  r
}