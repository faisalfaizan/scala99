package scala99

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class P01Suite extends FunSuite {

  import P01.last
  
  test("last element for a list of integers") {
    assert(last(List(1,2,3)) === 3)
  }
  
  test("empty list") {
    intercept[NoSuchElementException]{
      last(List())
    }
  }
  
  test("one element") {
    assert(last(List(10)) === 10)
  }
}
