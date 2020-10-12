package example

class A

trait B {
  def self(): B = this
}

class C extends A
