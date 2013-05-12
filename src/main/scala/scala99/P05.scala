package scala99

object P05 {
  
	def reverseSimple[A](list: List[A]) : List[A] = {
	  if(list.isEmpty) List()
	  else list.last ::reverseSimple(list.init)
	}  
	
	def reverseTail[A](list: List[A]) : List[A] = {
	  def reverseIter[A](rest: List[A], acc: List[A]): List[A] =
	  	if(rest.isEmpty) acc
	  	else reverseIter(rest.tail, rest.head :: acc)
	  
	  reverseIter(list, Nil)
	}  
}