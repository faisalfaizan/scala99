package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P03Suite extends FunSuite {
	import P03._
	
	test("nth: 2nd elment of list of numbers"){
	  assert(nth(2, List(1, 1, 2, 3, 5, 8)) === 2)
	}
	
	test("nth: empty list"){
	  intercept[NoSuchElementException]{
	    nth(0, List())
	  }
	}
}