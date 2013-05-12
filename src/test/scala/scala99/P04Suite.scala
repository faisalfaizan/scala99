package scala99

import org.scalatest.FunSuite

class P04Suite extends FunSuite{
	import P04._
	
	test("length: empty list")  {
	  assert(length(List()) === 0)
	}
	
	test("length: word list")  {
	  assert(length(List("all", "is", "well", "in", "the", "world")) === 6)
	}
}