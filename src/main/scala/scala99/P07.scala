package scala99

object P07 {

  /*************************************/
  /** Flatten a nested list structure **/
  /*************************************/
  def flatten(ls: List[Any]): List[Any] =
    ls flatMap {
      p =>
        p match {
          case x :: xs => flatten(x :: xs)
          case x => x :: Nil
        }
    }      
}