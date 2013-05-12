package scala99

object P08 {

  /**
  * Eliminate consecutive duplicates  
  * of list elements.
  * 1. without pattern matching          
  */
  /*
  def compress[A](ys: List[A]): List[A] = {
		def compressAcc[A](xs: List[A], acc: List[A]): List[A] = {
			if(xs.isEmpty) acc
			else if(xs.tail.isEmpty) xs.head :: acc
			else if(xs.head != xs.tail.head) compressAcc(xs.tail, xs.head :: acc)
			else compressAcc(xs.tail, acc)
		}
		
		compressAcc(ys, Nil).reverse
	}   
  */
  
  /**
   * 2.with pattern matching
   */
  def compress[A](xs: List[A]): List[A] = xs match {
    case Nil => xs
    case x :: xs1 => val (ys, zs) = xs span(_ == x)
      ys.head :: compress(zs)
  }
}