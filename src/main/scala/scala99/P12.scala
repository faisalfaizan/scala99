package scala99

import P10._

object P12 {

  
  /**
   * Decode a run-length encoded list. Given a run-length code list 
   * generated as specified in problem P10, construct its 
   * uncompressed version.
   */
  def decode[T](xs: List[(Int, T)]): List[T] = xs flatMap {
    case (n, e) => times(n,e)
  }

  def times[T](n: Int, e: T): List[T] = 
    if(n == 0) Nil else e :: times(n-1, e)
}