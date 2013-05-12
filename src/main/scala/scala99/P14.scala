package scala99

object P14 {

  /**
   * Duplicate the elements of a list.
   * scala> duplicate(List('a, 'b, 'c, 'c, 'd))
   * res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
   */
  def duplicate[T](xs: List[T]): List[T] = xs flatMap(x => x :: x :: Nil)
}
