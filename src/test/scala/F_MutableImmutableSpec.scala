import org.scalatest.FlatSpec
import MutableImmutable._

class MutableImmutableSpec extends FlatSpec {
  "Mutable Set" should "contains all given elements" in {
    assert(mutableSet == Set(1, 2, 3))
  }

  it should "be same address in memory as original" in {
    assert(mutableAddressBefore == mutableAddressAfter)
  }

  "Immutable Set" should "contains all given elements" in {
    assert(immutableSetVal3 == Set(1, 2, 3))
  }

  it should "not have been mutated" in {
    assert(immutableSetVal1 == Set(1))
    assert(immutableSetVal2 == Set(1, 2))
  }

  it should "be different address in memory than original" in {
    assert(immutableAddressBefore != immutableAddressAfter)
  }

  "Mutable and Immutable Sets" should "be comparable" in {
    assert(mutableSet == immutableSetVal3)
  }
}
