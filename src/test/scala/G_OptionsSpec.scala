import org.scalatest.FlatSpec

class OptionsSpec extends FlatSpec {
  "sayHello" should "greet a name" in {
    val example = Options(Option("Greg"))
    assert(example.sayHello == "Hello, Greg")
  }

  it should "handle None" in {
    val example = Options(None)
    assert(example.sayHello == "Hello, Stranger")
  }
}
