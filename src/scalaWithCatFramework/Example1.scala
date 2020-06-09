package scalaWithCatFramework

object Example1 extends App {
  trait Printable[T]{
    def format(value:T):String
  }

  /*
  Type Class instances provide the
  implementation for the type
  implicit means that can be used directly
   */
   object PrintableInstances{
    implicit val intInstance = new Printable[Int] {
      override def format(value: Int): String = value.toString
    }

    implicit val stringInstance =  new Printable[String] {
      override def format(value: String): String = s"Hello, It is a string instance $value"
    }
  }
/*
   Type cast interface exposes the functionality
   for the user
   It takes the instance of type cast as a parameter
   So printable knows only about printable trait/ type cast


 */
  object PrintableInterface{
  def print[T](value:T)(implicit printable:Printable[T]):Unit= println(printable.format(value))
}
  import PrintableInstances._

PrintableInterface.print("Swagarika Giri")
  /*
  There is another thing pip my library beautiful methods
   */

implicit class PrintableSyntax[T](value:T){
  def print(implicit printable: Printable[T]):Unit = println(printable.format(value))

}

  "Swagarika".print

}
