package scalaWithCatFramework

object Example2 extends App{

  //
  case class Cat(name:String, age:Int, color:String)


  //The abstract class
  /*
  It is the abstract class where
   */
  trait Printable[T] {
    def format(value: T): String
  }

  /*
  Printable instance will be called from Printable Interfaces
  Printable Instances actually has the implementation of the format class

   */






/*
   Instance has the actual representation and the implementation
   of the method
 */

  object PrintableCatInstance{
    implicit val catInstance=new Printable[Cat]{
      override def format(value: Cat): String = s"this is a cat names ${value.name} and its age is ${value.age} and color is ${value.color}"

    }
  }
  import PrintableCatInstance._
  implicit class PrintableCatInterface[T](value:T){
    def print(implicit printable: Printable[T]):Unit={
    println(printable.format(value))
    }
  }
 Cat("Kitten",5,"grey").print


}
