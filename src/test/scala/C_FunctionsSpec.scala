import org.scalatest.FlatSpec
import Functions._

class FunctionsSpec extends FlatSpec {
  "add" should "add ints" in {
    assert(add(1, 2) == 3)
  }

  "addIsActuallyAFunction" should "be the same as add" in {
    assert(add(1, 2) == addIsActuallyAFunction(1, 2))
  }
}
