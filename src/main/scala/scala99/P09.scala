package scala99

object P09 {

   /**
   * Pack consecutive duplicates of list elements into sublists.
   */
  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xs1 => val (ys, zs) = xs span(_ == x)
    	List(ys) ::: pack(zs)
  } 
}