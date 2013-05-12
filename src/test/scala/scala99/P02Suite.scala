package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P02Suite extends FunSuite{
  
	import P02._
	
	test("P02:penultimate: second last element for empty list"){
	  intercept[NoSuchElementException]{
	    penultimate(List())
	  }
	}
	
	test("P02:penultimate: second last element for one element list"){
	  intercept[NoSuchElementException]{
	    penultimate(List("India" -> "Delhi"))
	  }
	}
	
	test("P02:penultimate: second last element for random list") {
	  assert(penultimate(List(Set("baby"), Set("boy"), Set("girl"))) === Set("boy"))
	}
	
	test("P02:penultimate: for interger list") {
	  assert(penultimate(List(1, 1, 2, 3, 5, 8)) === 5)
	}
	
}