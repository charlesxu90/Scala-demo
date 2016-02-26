/**
  * Created by charles on 12/28/15.
  */
class NQueens {
  def queens(n: Int): List[List[Int]] = {
    def placeQueens(k: Int): List[List[Int]] =
      if (k == 0) List(List())
      else for { queens <- placeQueens(k - 1)
                 column <- List.range(1, n + 1)
                 if isSafe(column, queens, 1) } yield column :: queens
    placeQueens(n)
  }
}

