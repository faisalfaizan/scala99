package scala99

object P04 {
	def length[A](list: List[A]): Int =
	  if(list.isEmpty) 0
	  else 1 + length(list.tail)
}