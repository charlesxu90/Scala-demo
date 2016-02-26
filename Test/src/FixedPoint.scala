/**
  * Created by charles on 12/27/15.
  */
object FixedPoint {

  val tolerance = 0.0001

  def abs(d: Double) = if (d >= 0) d else -d

  def isCloseEnough(x: Double, y: Double) = abs((x -y)/x) < tolerance

  def fixedPoint(f: Double => Double)(firstGuess: Double) = {
    def iterate(guess: Double): Double = {
      val next = f(guess)
      println(next)
      if (isCloseEnough(guess, next)) next
      else iterate(next)
    }
    iterate(firstGuess)
  }

  //def sqrt(x: Double) = fixedPoint(y => x / y)(1.0)
  //def sqrt(x: Double) = fixedPoint(y => (y + x / y)/2)(1.0)

  def averageDamp(f: Double => Double) (x: Double) = (x + f(x)) / 2
  def sqrt(x: Double) = fixedPoint(averageDamp(y => x/y))(1.0)
  def cbrt(x: Double) = fixedPoint(averageDamp(y => x/(y * y)))(1.0)
  def main(args: Array[String]) {
    //sqrt(2)
    cbrt(8)
  }
}
