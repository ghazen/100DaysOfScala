case class Programmer(language: String, years: Int)

object Matching {
  def getMeal(time: String): String = time match {
    case "morning" => "eggs and bacon"
    case "lunch" => "chicken salad"
    case "supper" => "pizza"
    case _ => "we're closed!"
  }

  def sayHelloToAll(names: List[String]): String = names match {
    case Nil => "Anyone there?"
    case List(n) => s"Hello, $n!"
    case List("Greg", "Tim") => "Shouldn't you guys be presenting?!"
    case List("Greg", "Tim", n) =>
      s"Only $n is waiting for you to present!"
    case "Greg" :: "Tim" :: n =>
      s"${n.mkString(", ")} are all waiting for you to present!"
    case _ => s"Welcome everyone including ${names.mkString(", ")}"
  }

  def greetAProgrammer(programmer: Programmer): String = programmer match {
    case Programmer("Scala", n) if n <= 1 => "Scala is awesome!"
    case Programmer("Scala", n) if n > 1 =>
      "You should be giving this presentation!"
    case Programmer("Java", n) => "Come to the dark side!"
    case Programmer(_, n) if n > 0 => "I'm sorry..."
  }
}
