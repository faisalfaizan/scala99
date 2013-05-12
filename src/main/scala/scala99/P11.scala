package scala99

import P10._

object P11 {

  
  /**
   *  Modified run-length encoding.Modify the result of problem P10 
   *  in such a way that if an element has no duplicates it is simply 
   *  copied into the result list. Only elements with duplicates are 
   *  transferred as (N, E) terms.
   */
  def encodeModified[T](xs: List[T]): List[Any] = encode(xs) map {
    case (n, e) => if(n == 1) e else (n, e)
  }

}