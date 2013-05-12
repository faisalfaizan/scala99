package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P05Suite extends FunSuite{
	import P05._
	test("reverseSimple: reverse a list") {
	  assert( reverseSimple(List(1, 1, 2, 3, 5, 8)) ===  List(8, 5, 3, 2, 1, 1))
	}
	
	test("reverseTail: reverse a list of Integer") {
	  assert( reverseTail(List(1, 1, 2, 3, 5, 8)) ===  List(8, 5, 3, 2, 1, 1))
	}
	
	test("reverseTail: reverse a list String") {
	  assert( reverseTail(List("My", "name", "is", "Faisal")) ===  List("Faisal", "is", "name","My"))
	}
	
	test("reverseTail: reverse a list of one Element") {
	  assert( reverseTail(List(Set("one"))) ===  List(Set("one")))
	}
	
	test("reverseTail: an empty list") {
	  assert( reverseTail(List()) ===  Nil)
	}
	
	
}