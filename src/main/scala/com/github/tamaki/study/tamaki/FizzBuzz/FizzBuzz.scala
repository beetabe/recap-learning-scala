package com.github.tamaki.study.tamaki.FizzBuzz

/**
 * Created by tamaki on 2015/02/08.
 */
object FizzBuzz {
  /*
   * 1 ~ 100 まで
   * 3 の倍数は Fizz
   * 5 の倍数は Buzz
   * 15 の倍数は FizzBuzz
   * それ以外はそのまま数字を。
   */
  def main(args: Array[String]): Unit = {
    (1 to 100).foreach( n => {
      val fb = n % 15
      val b = n % 5
      val f = n % 3
      fb match {
        case 0 =>
          println("FizzBuzz")
        case _ =>
          b match {
            case 0 =>
              println("Buzz")
            case _ =>
              f match {
                case 0 =>
                  println("Fizz")
                case _ =>
                  println(n)
              }
          }
      }
   })
  }
}
