package scala99

import P09.pack

object P10 {

  
  /**
   * Run-length encoding of a list. Consecutive duplicates 
   * of elements are encoded as tuples (N, E) where N is 
   * the number of duplicates of the element E.
   */
  def encode[T](xs: List[T]): List[(Int, T)] = pack(xs) map(ys => (ys.size, ys.head))

}