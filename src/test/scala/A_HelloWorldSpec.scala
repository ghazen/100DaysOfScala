import org.scalatest.FlatSpec

class HelloWorldSpec extends FlatSpec {
  val helloWorld = new HelloWorld

  "getGreeting" should "return Hello, World" in {
    assert(helloWorld.getGreeting == "Hello, World!")
  }
}
