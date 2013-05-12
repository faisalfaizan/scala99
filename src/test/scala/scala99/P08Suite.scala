package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P08Suite extends FunSuite{
	import scala99.P08._
	
	test("compress: a list of symbols") {
	  assert(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) === List('a, 'b, 'c, 'a, 'd, 'e))
	}
	
	test("compress: an empty list"){
	  assert(compress(List()) === List())
	}
	
	test("compress: a list of 2 integers") {
	  assert(compress(List(1,2)) === List(1,2))
	}
}