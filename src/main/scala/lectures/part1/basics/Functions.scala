package scala
package lectures.part1.basics

object Functions extends App {

  def aFunction(a: String, b: Int): String = {

    a + " " + b
  }

  def aFunctionTwo(a: String, b: Int) = a + " " + b

  println(aFunction("hello", 3))

  def aFunctionNoParam(): Int = 42

  println(aFunctionNoParam())

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello", 4))

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n-1)
  }

  def ageGreeting(name: String, age: Int) = f"Hi, my name is $name and I am $age years old"

  println(ageGreeting("Wladimir", 28))

  def factorial(n: Int): Int = {
    if (n <= 0) 1
    else n * factorial(n-1)
  }

  println(factorial(5))

  def fibonacci(d: Int):Int = {
    if (d <= 2) 1
    else fibonacci(d-1) + fibonacci(d-2)
  }

  println(fibonacci(6))

  def primeNumber(n: Int):Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t-1)

    isPrimeUntil(n / 2)
  }


}
