package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P14Suite extends FunSuite{
  
	import P14._
	
	test("duplicate: a list of few elements") {
	 assert(duplicate(List('a, 'b, 'c, 'c, 'd)) ===
	   List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
	  }
	
	test("duplicate: an empty list") {
	  assert(duplicate(List()) === List())
	}
	
	test("duplicate: one word list") {
	  assert(duplicate(List("scala")) === List("scala", "scala"))
	}
	
}