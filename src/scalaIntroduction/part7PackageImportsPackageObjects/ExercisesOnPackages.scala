package scalaIntroduction.part7PackageImportsPackageObjects


import scalaIntroduction.part2OOPs.{Novel, Writer=>BookWriter}


/*
 1. You can access the classes and object in same package without importing them
 2. We need to import them in case they are in other Package
 3. Use of alias in case of functions having same name
 4. There is another concept called PackageObject that is common for each Package it has the same name as package
 5. We can also use the entire name  or fully-qualified name whenever necesarry
 */

import java.util.Date
import java.sql.{Date=>SqlDate}



object ExercisesOnPackages extends App{

val writer = new BookWriter("Swagarika","Giri","09-06-1995")
  val novel = new Novel("Aapbiti","2020",writer)
  val dateUtil = new Date()
  val dateSql = new SqlDate(1996,1,6)


}
