import org.scalatest.FlatSpec

class ClassesSpec extends FlatSpec {
  val classInstance = new MyClass(1, "b")
  val caseClassInstance = new MyCaseClass(1, "b")

  "Variables in class definition" should "be accessible" in {
    assert(classInstance.a == 1)
    // Doesn't compile
//    assert(classInstance.b == "b")
    assert(classInstance.c == 3)

    assert(caseClassInstance.a == 1)
    assert(caseClassInstance.b == "b")
    assert(caseClassInstance.c == 3)

    assert(SingletonObject.a == 1)
    assert(SingletonObject.b == "b")
  }

  "Case Classes" should "print useful information" in {
    // Note the toString doesn't include c
    assert("MyCaseClass(1,b)" == caseClassInstance.toString)
  }
}
