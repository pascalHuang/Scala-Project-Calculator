package main

import Calculator.Function._

object Main extends App {

    val n4 = Number(4)
    val n2 = Number(2)
    println("final : "+ ShowExpression(eval(Add(n4, n2))(n4)))


}