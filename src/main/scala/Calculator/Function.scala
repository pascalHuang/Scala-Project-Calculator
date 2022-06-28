package Calculator

import scala.math.{cos, sin}

object Function extends Expr {

  def ShowExpression (e: Expr): String = {
    e match {
      case Number(t) => t.toString
      case X => "X"

      case Add(t1, t2) => "("+ShowExpression(t1)+ " + " +ShowExpression(t2)+")"
      case Mul(t1, t2) => "("+ShowExpression(t1)+ " * " +ShowExpression(t2)+")"

      case Cos(t) => "cos("+ShowExpression(t)+")"
      case Sin(t) => "sin("+ShowExpression(t)+")"
    }
  }

  def eval (e: Expr) (x: Double): Double = {
    e match {

      case X => x
      case Number(a) => a

      case Add(t1, X) => eval(t1)(x) + eval(X)(x)
      case Mul(t1, X) => eval(t1)(x) * eval(X)(x)

      case Cos(t1) => cos(eval(t1)(x))
      case Sin(t1) => sin(eval(t1)(x))
    }
  }
}
