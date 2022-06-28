package Calculator

trait Expr {

  case class Add(t1: Expr, t2: Expr) extends Expr
  case class Mul(t1: Expr, t2: Expr) extends Expr

  case class Number(t: Double) extends Expr

  case class Sin(t: Expr) extends Expr
  case class Cos(t: Expr) extends Expr

  case object X extends Expr
}

