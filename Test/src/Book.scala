import scala.collection.JavaConverters._

/**
  * Created by charles on 12/28/15.
  */
case class Book (title: String, authors: List[String])
/*
val books: List[Book] = List(
  Book("Structure and Interpretation of Computer Programs",
    List("Abelson, Harold", "Sussman, Gerald J.")), Book("Principles of Compiler Design",
    List("Aho, Alfred", "Ullman, Jeffrey")), Book("Programming in Modula-2",
    List("Wirth, Niklaus")), Book("Introduction to Functional Programming"),
  List("Bird, Richard")),
Book("The Java Language Specification",
  List("Gosling, James", "Joy, Bill", "Steele, Guy", "Bracha, Gilad")))
for (b <- books; a <- b.authors if a startsWith "Ullman") yield b.title

for (b <- books; val t = b.title; if (t indexOf "Program") >= 0) yield b.title.asJava

for (b1 <- books; b2 <- books if b1 != b2;
     a1 <- b1.authors; a2 <- b2.authors if a1 == a2)
  yield a1

def removeDuplicates[A](xs: List[A]): List[A] =
  if (xs.isEmpty) xs
  else xs.head :: removeDuplicates(xs.tail filter (x => x != xs.head))
  //else xs.head :: removeDuplicates(for (x <- xs.tail if x != xs.head) yield x)

object Demo {
  def map[A, B](xs: List[A], f: A => B): List[B] =
    for (x <- xs) yield f(x)
  def flatMap[A, B](xs: List[A], f: A => List[B]): List[B] =
    for (x <- xs; y <- f(x)) yield y
  def filter[A](xs: List[A], p: A => Boolean): List[A] =
    for (x <- xs if p(x)) yield x

  // Exercise
  def flatten[A](xss: List[List[A]]): List[A] =
    (xss :\ (Nil: List[A])) ((xs, ys) => xs ::: ys)

  def flatten[A](xss: List[List[A]]): List[A] =
    for (x <- xss :\ (Nil: List[A]))  arr::: x

  for (b <- books; a <- b.authors if a startsWith "Bird") yield b.title

  books.map(b =>
      if (b.authors.filter(a => a startsWith "Bird").length > 0) b.title
  )

  for (b <- books if (b.title indexOf "Program") >= 0) yield b.title.asJava

  var titles = books.filter(b => (b.title indexOf "Program") >= 0)
    .map(b =>b.title)
}
*/