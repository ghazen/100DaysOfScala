import org.scalatest.FlatSpec
import Functions._

class FunctionsSpec extends FlatSpec {
  "add" should "add ints" in {
    assert(add(1, 2) == 3)
  }

  "addIsActuallyAFunction" should "be the same as add" in {
    assert(add(1, 2) == addIsActuallyAFunction(1, 2))
  }

  "placeholders" should "take parameters for underscores" in {
    assert(placeholders(1, 2) == 3)
    assert(placeholdersWithParams(1, 2) == 3)
  }

  it should "be reusable" in {
    val list = List(1, 2, 3)
    assert(list.reduceLeft(placeholders) == 6)
    assert(list.reduceLeft(placeholdersWithParams) == 6)
    assert(list.reduceLeft(_ + _) == 6)
  }
}
