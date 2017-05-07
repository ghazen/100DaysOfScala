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
}
