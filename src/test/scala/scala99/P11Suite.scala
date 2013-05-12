package scala99

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class P11Suite extends FunSuite{

  import scala99.P11._
  
  test("encodeModified: list of few elements") {
    assert(encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) ===
      List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e)))
  }
  
  test("encodeModified: empty list") {
    assert(encodeModified(List()) == Nil)
  }
  
}