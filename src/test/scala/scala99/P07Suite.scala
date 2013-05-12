package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class P07Suite extends FunSuite {

  import scala99.P07._
  
  test("flatten: a list") {
    assert(flatten(List(List(1, 1), 2, List(3, List(5, 8)))) === List(1, 1, 2, 3, 5, 8))
  }
  
  test("flatten: an empty list") {
    assert(flatten(List()) === List())
  }
  
  test("flatten: a list of words") {
    assert(flatten(List(List("words", "have"), List("meaning"))) === List("words", "have", "meaning"))
  }
}