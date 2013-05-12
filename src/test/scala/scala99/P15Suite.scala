package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P15Suite extends FunSuite{
  
	import P15._
	
	test("duplicateN: a list of few elements") {
	 assert(duplicateN(3, List('a, 'b, 'c, 'c, 'd)) ===
	   List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
	  }
	
	test("duplicateN: an empty list") {
	  assert(duplicateN(3, List()) === List())
	}
	
	test("duplicateN: one word list") {
	  assert(duplicateN(4, List("scala")) === List("scala", "scala", "scala", "scala"))
	}
	
}