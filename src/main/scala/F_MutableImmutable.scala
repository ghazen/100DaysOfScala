import scala.collection.{mutable, immutable}

object MutableImmutable {
  var mutableAddressBefore = 0
  var mutableAddressAfter = 0
  var immutableAddressBefore = 0
  var immutableAddressAfter = 0

  val mutableSet = mutable.Set[Int](1)
  mutableAddressBefore = System.identityHashCode(mutableSet)
  mutableSet += 2
  mutableSet += 3
  mutableAddressAfter = System.identityHashCode(mutableSet)

  val immutableSetVal1 = immutable.Set[Int](1)
  // Does not compile
//  immutableSetVal1 += 2
  val immutableSetVal2 = immutableSetVal1 + 2
  val immutableSetVal3 = immutableSetVal2 + 3

  var immutableSetVar = immutable.Set[Int](1)
  immutableAddressBefore = System.identityHashCode(immutableSetVar)
  immutableSetVar += 2
  immutableSetVar += 3
  immutableAddressAfter = System.identityHashCode(immutableSetVar)
}
