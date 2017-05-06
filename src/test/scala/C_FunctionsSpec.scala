import org.scalatest.FlatSpec
import Functions._

class FunctionsSpec extends FlatSpec {
  "add" should "add ints" in {
    assert(add(1, 2) == 3)
  }
}
