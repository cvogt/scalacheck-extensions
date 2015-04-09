package org.cvogt.scalacheck.examples

import org.scalacheck.{Prop,Properties}

object Examples211 extends Properties("Examples211") {
  import org.cvogt.scalacheck.GenTree

  property("concrete class") = {
    final case class B(i: Int, s: String)
    Prop.forAll(GenTree.tree[B]){
      case B(_,_) => true
    }    
  }
  property("closed hierarchy") = {
    sealed abstract class Tree
    final case class Node(left: Tree, right: Tree, v: Int) extends Tree
    case object Leaf extends Tree

    Prop.forAll(GenTree.tree[Tree]){
      case Leaf => true
      case Node(_,_,_) => true
    }

    sealed trait A
    sealed case class B(i: Int, s: String) extends A
    case object C extends A
    sealed trait D extends A
    final case class E(a: Double, b: Option[Float]) extends D
    case object F extends D
    sealed abstract class Foo extends D
    case object Baz extends Foo
    final class Bar extends Foo
    final class Baz(i1: Int)(s1: String) extends Foo

    Prop.forAll(GenTree.tree[A]){
      case _:A => true
    }

    Prop.forAll(GenTree.tree[D]){
      case _:D => true
    }
  }

  property("open hierarchy") = {
    sealed abstract class Tree
    case class Node(left: Tree, right: Tree, v: Int) extends Tree
    case object Leaf extends Tree

    Prop.forAll(GenTree.partialTree[Tree]){
      case Leaf => true
      case Node(_,_,_) => true
    }
  }
}
