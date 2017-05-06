object Functions {
  def printSomething: Unit = println("Something")

  def add(a: Int, b: Int): Int = a + b

  // Note Scala is purely object-oriented
  def addIsActuallyAFunction(a: Int, b: Int): Int = a.+(b)
}
