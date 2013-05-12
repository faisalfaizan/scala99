package scala99

object P16 {
  
  /**
   * Drop every Nth element from a list.
   * scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
   * res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
   */
  def drop[T](n: Int, xs: List[T]): List[T] = {
    val list = xs.zipWithIndex
    (list filter {case (e, i) => ((i+1) % n != 0) }) map {case (e, i) => e}
  }   

}