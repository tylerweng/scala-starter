package hello
import org.scalajs.dom.{document, Node}

object HelloWorld {

  def appendHello(targetNode: Node, text: String): Unit = {
    val titleNode = document.createElement("h1")
    val textNode = document.createTextNode(text)
    titleNode.appendChild(textNode)
    targetNode.appendChild(titleNode)
  }

  def main(args: Array[String]): Unit = {
    appendHello(document.body, "Hello World")
  }
}