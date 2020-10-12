package example

class A[X] {
  type S = X
}

trait B {
  def self(): B = this
}

class C extends A["hello"] with B
