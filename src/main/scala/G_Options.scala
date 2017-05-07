case class Options(name: Option[String]) {
  def sayHello: String = name match {
    case None => "Hello, Stranger"
    case n => s"Hello, ${n.get}"
  }
}
