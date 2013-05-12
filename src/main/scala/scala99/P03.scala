package scala99

/** Find the Kth element of a list.
By convention, the first element in the list is element 0.*/
object P03 {
	def nth[A](n: Int, list: List[A]): A ={
	  if(list.isEmpty || n < 0) throw new NoSuchElementException
	  
	  def nthIter(acc: Int, subList: List[A]): A =
	  	if(acc == n) subList.head 
	  	else nthIter(acc + 1, subList.tail)
	  	
	 nthIter(0, list) 
	}
	
	def nthWithBuiltIn[A](n: Int, list: List[A]): A ={
	  if(list.isEmpty || n < 0) throw new NoSuchElementException
	  else list(n) 
	}
}