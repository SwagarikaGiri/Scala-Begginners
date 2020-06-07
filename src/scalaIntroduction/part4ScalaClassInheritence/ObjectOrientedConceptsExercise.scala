//package lectures.part4ScalaClassInheritence
//
//object ObjectOrientedConceptsExercise {
//  trait MyPredicate[-T]{
//    def helperMethod:Boolean
//  }
//  class EvenPredicate[T] extends MyPredicate[T]{
//    override def helperMethod: Boolean = ???
//
//  }
//
//  trait MyTransformer[-A,B]{
//    def transform:B
//  }
//  class StringToIntTransformer[A,B] extends MyTransformer[A,B]{
//    override def transform(obj1:A,obj2:B): B =
//
//  }
//
//  abstract class MyList[A]{
//    def map:MyList[A]
//    def filter:MyList[A]
//    def flatMap:MyList[A]
//  }
//}
