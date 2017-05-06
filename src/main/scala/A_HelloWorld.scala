object HelloWorld {
  def main(args: Array[String]): Unit = {
    val helloWorld = new HelloWorld
    println(helloWorld.getGreeting)
  }
}

class HelloWorld {
  def getGreeting: String = "Hello, World!"
}
