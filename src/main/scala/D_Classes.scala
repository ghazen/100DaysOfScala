class MyClass(val a: Int, b: String) {
  val c: Int = 3
}

case class MyCaseClass(a: Int, b: String) {
  val c: Int = 3
}

object SingletonObject {
  val a: Int = 1
  val b: String = "b"
}

trait MyFirstTrait {
  def getName: String = "Trait 1"
}

trait MySecondTrait {
  val number = 50
}

class MyMixin extends MyFirstTrait with MySecondTrait

class MyMixinOverride extends MyFirstTrait with MySecondTrait {
  override def getName: String = "My Mixin"

  // Note this doesn't compile
  //  override number = 75
  override val number = 75
}

trait MyThirdTrait {
  def getName: String = "Trait 2"
}

// Note this creates a compiler error
//class MyMixinError extends MyFirstTrait with MyThirdTrait
