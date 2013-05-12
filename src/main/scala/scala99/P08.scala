package scala99

object P08 {

  /**************************************/
  /** Eliminate consecutive duplicates **/ 
  /**       of list elements.          **/
  /**************************************/
  def compress[A](ys: List[A]): List[A] = {
		def compressAcc[A](xs: List[A], acc: List[A]): List[A] = {
			if(xs.isEmpty) acc
			else if(xs.tail.isEmpty) xs.head :: acc
			else if(xs.head != xs.tail.head) compressAcc(xs.tail, xs.head :: acc)
			else compressAcc(xs.tail, acc)
		}
		
		compressAcc(ys, Nil).reverse
	}         
}