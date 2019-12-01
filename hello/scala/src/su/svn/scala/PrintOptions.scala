package su.svn.scala

object PrintOptions {
  def main(args: Array[String]): Unit = {
    println("Выбраны опции: " +: (args filter(_ startsWith "-") map(" " + _.drop(1))) mkString "\n")
  }
}
