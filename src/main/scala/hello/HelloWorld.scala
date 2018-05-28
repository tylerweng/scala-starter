package hello
import org.scalajs.dom.{document, Node}

object HelloWorld {

  def appendNode(targetNode: Node, text: String, tagName: String): Unit = {
    val childNode = document.createElement(tagName)
    val textNode = document.createTextNode(text)
    childNode.appendChild(textNode)
    targetNode.appendChild(childNode)
  }

  def main(args: Array[String]): Unit = {
    appendNode(document.body, "Hello World!", "h1")
  }
}