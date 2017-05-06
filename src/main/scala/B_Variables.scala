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
