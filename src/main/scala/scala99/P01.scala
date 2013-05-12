package scala99

object P01 {
	def last[A](list: List[A]): A = {
	  if(list.isEmpty) throw new NoSuchElementException
	  
	  if(list.tail.isEmpty) list.head
	  else last(lastIter(list.head, list.tail))
	}
	
	def lastIter[A](head: A, rest: List[A]): List[A] = {
	  if(rest.isEmpty) List(head)
	  else lastIter(rest.head, rest.tail)
	}
}
