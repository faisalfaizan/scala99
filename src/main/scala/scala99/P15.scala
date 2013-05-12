package scala99

import P12._
object P15 {

  /**
   * Duplicate the elements of a list a given number of times.
   * scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
   * res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
   */
  def duplicateN[T](n: Int, xs: List[T]): List[T] = xs flatMap(x  => times(n, x))
}