package scala99

import P10._

object P13 {

  
  /**
   * Run-length encoding of a list (direct solution). 
   * 
   */
  def encodeDirect[T](xs: List[T]): List[(Int, T)] = xs match {
    case Nil => Nil
    case x :: xs1 => val (ys, zs) = xs span(_ == x)
      (ys.size, ys.head) :: encodeDirect(zs)
  }

}