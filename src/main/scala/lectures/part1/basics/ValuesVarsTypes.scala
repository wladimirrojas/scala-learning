package scala
package lectures.part1.basics

object ValuesVarsTypes extends App {

  //val are immutable

  val x: Int = 42
  println(x)

  val y = 40
  println(y)

  val name: String = "Wladimir"
  val nameSecond = "Alfredo"

  val bool: Boolean = false
  val charValue: Char = 'a'
  val anInt: Int = x
  val aLong: Long = 34654523464L
  val aFloat: Float = 20.345f
  val aDouble: Double = 3.1415

  // var are mutable
  var aVariable: Int = 4
  aVariable = 5

}
