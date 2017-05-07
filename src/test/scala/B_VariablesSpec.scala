import org.scalatest.FlatSpec
import Variables._

class VariablesSpec extends FlatSpec {
  "incrementMutableVariable" should "increment" in {
    assert(incrementMutableVariable == 1)
    assert(incrementMutableVariable == 2)
    assert(incrementMutableVariable == 3)
    assert(incrementMutableVariable == 4)
  }
}
