object Functions {
  def printSomething: Unit = println("Something")

  def add(a: Int, b: Int): Int = a + b

  // Note Scala is purely object-oriented
  def addIsActuallyAFunction(a: Int, b: Int): Int = a.+(b)

  def placeholders = (_: Int) + (_: Int)
  def placeholdersWithParams = (a: Int, b: Int) => a + b

  def functionTakesAFunction(f: (Int, Int) => Int) = f(1, 2)
}
