package org.cvogt.scalacheck.examples

import org.scalacheck.{Prop,Properties}

object Examples211 extends Properties("Examples211") {
  import org.cvogt.scalacheck.GenTree

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
/*package org.cvogt.test.scalacheck
import org.scalacheck._

import org.cvogt.scalacheck._

sealed abstract class Tree
case class Node(left: Tree, right: Tree, v: Int) extends Tree
case object Leaf extends Tree

import org.scalacheck._
import GenTree._
import Arbitrary.arbitrary

sealed trait A
sealed case class B(i: Int, s: String) extends A
case object C extends A
sealed trait D extends A
final case class E(a: Double, b: Option[Float]) extends D
case object F extends D
//trait Foo extends D
sealed abstract class Foo extends D
case object Baz extends Foo
final class Bar extends Foo

object GenADTSpecification extends Properties("GenADT") {
  import Prop._

  val genLeaf = const(Leaf)

  val genNode = for {
    v <- arbitrary[Int]
    left <- genTree
    right <- genTree
  } yield Node(left, right, v)

  def genTree: GenTree[Tree] = oneOf(genLeaf, genNode)

  property("GenADT") = {
    implicit def arbitraryTree = Arbitrary(genTree)
    exists( arbitrary[(Tree,Tree)] ){
      case (t1,t2) => t1 != t2
    }
  }

  property("GenADT") = {
    implicit val a = Arbitrary(GenMacros.partialTree[Tree])
    exists(arbitrary[(Tree,Tree)]){
      case (t1,t2) => t1 != t2
    }
  }
  property("GenADT") = {
    forAll(GenMacros.partialTree[Tree]){
      case Leaf => true
      case Node(_,_,_) => true
    }
  }
  property("GenADT") = {
    forAll( GenMacros.tree[A] ){
      case (t1) =>
        //println(t1)
        true
    }
  }
/*
  //implicit def useAlNum = Arbitrary(GenTree.alphaStr)
  def check[R](implicit fmt: Format[R], a:Arbitrary[R])
   = forAll(a.arbitrary){ p =>
      val json = Json.toJson(p)
      val res = Json.fromJson[R](json)
      /*
      //println(Json.stringify(json))
      res match{
        case JsSuccess(v,_) => (p,v) match {
          case (TimeIntent(Some(a),_,_,_,_),TimeIntent(Some(b),_,_,_,_)) =>
            println(a.getChronology);
            println(b.getChronology);
            assert(a.===(b));
          case _ =>
        }
        case _ =>
      }*/
      assert(JsSuccess(p) === res)
    }

  implicit def g01 = GenTree.resultOf(LocationEntity.apply _)
  implicit def g02 = GenTree.resultOf(PersonEntity.apply _)
  implicit def g03 = GenTree.resultOf(TimeIntent.apply _)
  implicit def g04 = GenTree.resultOf(TimeEntity.apply _)
  implicit def g05 = GenTree.resultOf(EmailParticipant.apply _)
  implicit def g06 = GenTree.resultOf(EmailHeaders.apply _)
  implicit def g07 = GenMore.resultOf(Email.apply _)

  test("serialization"){  
    check[LocationEntity]
    check[PersonEntity]
    check[TimeIntent]
    check[TimeEntity]
    check[EmailHeaders]
    check[Email]
  }*/
}
*/