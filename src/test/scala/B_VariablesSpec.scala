import org.scalatest.FlatSpec

class VariablesSpec extends FlatSpec {
  "incrementMutableVariable" should "increment" in {
    assert(Variables.incrementMutableVariable == 1)
    assert(Variables.incrementMutableVariable == 2)
    assert(Variables.incrementMutableVariable == 3)
    assert(Variables.incrementMutableVariable == 4)
  }
}
