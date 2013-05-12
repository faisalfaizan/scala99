package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P16Suite extends FunSuite{
  
	import P16._
	
	test("drop: a list of few elements") {
	 assert(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) ===
	   List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
	  }
	
	test("drop: an empty list") {
	  assert(drop(3, List()) === List())
	}
	
}