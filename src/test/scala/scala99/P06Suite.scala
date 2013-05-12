package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import scala99.P06.isPalindrome
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P06Suite extends FunSuite{
	import scala99.P06._
	
	test("isPalindrome: test a list") {
	  assert(isPalindrome(List(1, 2, 3, 2, 1)), "List(1, 2, 3, 2, 1) Not a palindrom")
	}
	
	test("isPalindrome: test an empty list") {
	  assert(isPalindrome(List()), "Empty list")
	}
}