package scala99

object P02 {
	def penultimate[A](list: List[A]): A = 
	  if(list.isEmpty || list.tail.isEmpty) throw new NoSuchElementException
	  else list.reverse.tail.head
}