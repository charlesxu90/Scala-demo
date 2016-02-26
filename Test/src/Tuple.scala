/**
  * Created by charles on 12/27/15.
  */
class Tuple {

}
case class Tuple2[A, B] (_1: A, _2: B)

def divmod(x: Int, y: Int) = new Tuple2[Int, Int](x/y, x%y)

val xy = divmod(x, y)
println(xy._1, + xy._2)