object Variables {
  private var mutableVariable = 0
  private val immutableVariable = 0

  def incrementMutableVariable: Int = {
    mutableVariable = mutableVariable + 1
    mutableVariable
  }

  // Won't compile
//  def incrementImmutableVariable = immutableVariable = immutableVariable + 1
}

//"The Scala perspective, however, is that val and var are
// just two different tools in your toolbox, both useful,
// neither inherently evil. Scala encourages you to lean
// towards vals, but ultimately reach for the best tool
// given the job at hand."
// -- Programming in Scala 3rd Ed
//    Martin Odersky, Lex Spoon, Bill Venners
