import org.scalatest.FlatSpec
import Matching._

class MatchingSpec extends FlatSpec {
  "getMeal" should "return an appropriate meal" in {
    assert(getMeal("morning") == "eggs and bacon")
    assert(getMeal("lunch") == "chicken salad")
    assert(getMeal("supper") == "pizza")
  }

  it should "handle other times with closed" in {
    assert(getMeal("midnight") == "we're closed!")
  }

  "sayHelloToAll" should "greet a single person" in {
    assert(sayHelloToAll(List("Greg")) == "Hello, Greg!")
  }

  it should "greet no people" in {
    assert(sayHelloToAll(List()) == "Anyone there?")
  }

  it should "greet multiple people" in {
    assert(
      sayHelloToAll(List("Larry", "Curly", "Mo")) == "Welcome everyone including Larry, Curly, Mo")
  }

  it should "greet Greg and Tim" in {
    assert(
      sayHelloToAll(List("Greg", "Tim")) == "Shouldn't you guys be presenting?!")
    assert(
      sayHelloToAll(List("Greg", "Tim", "Larry")) == "Only Larry is waiting for you to present!")
    assert(
      sayHelloToAll(List("Greg", "Tim", "Larry", "Curly", "Mo")) == "Larry, Curly, Mo are all waiting for you to present!")
  }

  "greetAProgrammer" should "speak truth" in {
    assert(greetAProgrammer(Programmer("Scala", 1)) == "Scala is awesome!")
    assert(
      greetAProgrammer(Programmer("Scala", 2)) == "You should be giving this presentation!")
    assert(
      greetAProgrammer(Programmer("Java", 21)) == "Come to the dark side!")
    assert(greetAProgrammer(Programmer(".NET", 1)) == "I'm sorry...")
  }
}
