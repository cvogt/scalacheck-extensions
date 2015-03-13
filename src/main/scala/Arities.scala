package org.cvogt.scalacheck
import org.scalacheck._

/**
Defines implicit [[org.scalacheck.Arbitrary]] instances for tuples and functions
*/
object ArbitraryArities{
  // Functions //
  
  /** Arbitrary instance of Function1 */
  implicit def arbFunction1[T1,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1) => r
      )
  
  /** Arbitrary instance of Function2 */
  implicit def arbFunction2[T1,T2,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2) => r
      )
  
  /** Arbitrary instance of Function3 */
  implicit def arbFunction3[T1,T2,T3,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3) => r
      )
  
  /** Arbitrary instance of Function4 */
  implicit def arbFunction4[T1,T2,T3,T4,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4) => r
      )
  
  /** Arbitrary instance of Function5 */
  implicit def arbFunction5[T1,T2,T3,T4,T5,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5) => r
      )
  
  /** Arbitrary instance of Function6 */
  implicit def arbFunction6[T1,T2,T3,T4,T5,T6,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6) => r
      )
  
  /** Arbitrary instance of Function7 */
  implicit def arbFunction7[T1,T2,T3,T4,T5,T6,T7,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7) => r
      )
  
  /** Arbitrary instance of Function8 */
  implicit def arbFunction8[T1,T2,T3,T4,T5,T6,T7,T8,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8) => r
      )
  
  /** Arbitrary instance of Function9 */
  implicit def arbFunction9[T1,T2,T3,T4,T5,T6,T7,T8,T9,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9) => r
      )
  
  /** Arbitrary instance of Function10 */
  implicit def arbFunction10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10) => r
      )
  
  /** Arbitrary instance of Function11 */
  implicit def arbFunction11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11) => r
      )
  
  /** Arbitrary instance of Function12 */
  implicit def arbFunction12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12) => r
      )
  
  /** Arbitrary instance of Function13 */
  implicit def arbFunction13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13) => r
      )
  
  /** Arbitrary instance of Function14 */
  implicit def arbFunction14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13,t14:T14) => r
      )
  
  /** Arbitrary instance of Function15 */
  implicit def arbFunction15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13,t14:T14,t15:T15) => r
      )
  
  /** Arbitrary instance of Function16 */
  implicit def arbFunction16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13,t14:T14,t15:T15,t16:T16) => r
      )
  
  /** Arbitrary instance of Function17 */
  implicit def arbFunction17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13,t14:T14,t15:T15,t16:T16,t17:T17) => r
      )
  
  /** Arbitrary instance of Function18 */
  implicit def arbFunction18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13,t14:T14,t15:T15,t16:T16,t17:T17,t18:T18) => r
      )
  
  /** Arbitrary instance of Function19 */
  implicit def arbFunction19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13,t14:T14,t15:T15,t16:T16,t17:T17,t18:T18,t19:T19) => r
      )
  
  /** Arbitrary instance of Function20 */
  implicit def arbFunction20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13,t14:T14,t15:T15,t16:T16,t17:T17,t18:T18,t19:T19,t20:T20) => r
      )
  
  /** Arbitrary instance of Function21 */
  implicit def arbFunction21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13,t14:T14,t15:T15,t16:T16,t17:T17,t18:T18,t19:T19,t20:T20,t21:T21) => r
      )
  
  /** Arbitrary instance of Function22 */
  implicit def arbFunction22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,R]
    (implicit a: Arbitrary[R]): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22) => R]
    = Arbitrary(
        for(r <- a.arbitrary) yield (t1:T1,t2:T2,t3:T3,t4:T4,t5:T5,t6:T6,t7:T7,t8:T8,t9:T9,t10:T10,t11:T11,t12:T12,t13:T13,t14:T14,t15:T15,t16:T16,t17:T17,t18:T18,t19:T19,t20:T20,t21:T21,t22:T22) => r
      )
  

  // Tuples //
  
  /** Arbitrary instance of 2-Tuple */
  implicit def arbTuple2[T1,T2](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2]
  ): Arbitrary[(T1,T2)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary
      } yield (t1, t2))
  
  /** Arbitrary instance of 3-Tuple */
  implicit def arbTuple3[T1,T2,T3](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3]
  ): Arbitrary[(T1,T2,T3)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary
      } yield (t1, t2, t3))
  
  /** Arbitrary instance of 4-Tuple */
  implicit def arbTuple4[T1,T2,T3,T4](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4]
  ): Arbitrary[(T1,T2,T3,T4)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary
      } yield (t1, t2, t3, t4))
  
  /** Arbitrary instance of 5-Tuple */
  implicit def arbTuple5[T1,T2,T3,T4,T5](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5]
  ): Arbitrary[(T1,T2,T3,T4,T5)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary
      } yield (t1, t2, t3, t4, t5))
  
  /** Arbitrary instance of 6-Tuple */
  implicit def arbTuple6[T1,T2,T3,T4,T5,T6](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary
      } yield (t1, t2, t3, t4, t5, t6))
  
  /** Arbitrary instance of 7-Tuple */
  implicit def arbTuple7[T1,T2,T3,T4,T5,T6,T7](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7))
  
  /** Arbitrary instance of 8-Tuple */
  implicit def arbTuple8[T1,T2,T3,T4,T5,T6,T7,T8](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8))
  
  /** Arbitrary instance of 9-Tuple */
  implicit def arbTuple9[T1,T2,T3,T4,T5,T6,T7,T8,T9](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9))
  
  /** Arbitrary instance of 10-Tuple */
  implicit def arbTuple10[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10))
  
  /** Arbitrary instance of 11-Tuple */
  implicit def arbTuple11[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11))
  
  /** Arbitrary instance of 12-Tuple */
  implicit def arbTuple12[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12))
  
  /** Arbitrary instance of 13-Tuple */
  implicit def arbTuple13[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13))
  
  /** Arbitrary instance of 14-Tuple */
  implicit def arbTuple14[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary; t14<-a14.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14))
  
  /** Arbitrary instance of 15-Tuple */
  implicit def arbTuple15[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary; t14<-a14.arbitrary; t15<-a15.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15))
  
  /** Arbitrary instance of 16-Tuple */
  implicit def arbTuple16[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary; t14<-a14.arbitrary; t15<-a15.arbitrary; t16<-a16.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16))
  
  /** Arbitrary instance of 17-Tuple */
  implicit def arbTuple17[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary; t14<-a14.arbitrary; t15<-a15.arbitrary; t16<-a16.arbitrary; t17<-a17.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17))
  
  /** Arbitrary instance of 18-Tuple */
  implicit def arbTuple18[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary; t14<-a14.arbitrary; t15<-a15.arbitrary; t16<-a16.arbitrary; t17<-a17.arbitrary; t18<-a18.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18))
  
  /** Arbitrary instance of 19-Tuple */
  implicit def arbTuple19[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary; t14<-a14.arbitrary; t15<-a15.arbitrary; t16<-a16.arbitrary; t17<-a17.arbitrary; t18<-a18.arbitrary; t19<-a19.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19))
  
  /** Arbitrary instance of 20-Tuple */
  implicit def arbTuple20[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary; t14<-a14.arbitrary; t15<-a15.arbitrary; t16<-a16.arbitrary; t17<-a17.arbitrary; t18<-a18.arbitrary; t19<-a19.arbitrary; t20<-a20.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20))
  
  /** Arbitrary instance of 21-Tuple */
  implicit def arbTuple21[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20], a21:Arbitrary[T21]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary; t14<-a14.arbitrary; t15<-a15.arbitrary; t16<-a16.arbitrary; t17<-a17.arbitrary; t18<-a18.arbitrary; t19<-a19.arbitrary; t20<-a20.arbitrary; t21<-a21.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21))
  
  /** Arbitrary instance of 22-Tuple */
  implicit def arbTuple22[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22](implicit
    a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20], a21:Arbitrary[T21], a22:Arbitrary[T22]
  ): Arbitrary[(T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22)]
    = Arbitrary(for {
        t1<-a1.arbitrary; t2<-a2.arbitrary; t3<-a3.arbitrary; t4<-a4.arbitrary; t5<-a5.arbitrary; t6<-a6.arbitrary; t7<-a7.arbitrary; t8<-a8.arbitrary; t9<-a9.arbitrary; t10<-a10.arbitrary; t11<-a11.arbitrary; t12<-a12.arbitrary; t13<-a13.arbitrary; t14<-a14.arbitrary; t15<-a15.arbitrary; t16<-a16.arbitrary; t17<-a17.arbitrary; t18<-a18.arbitrary; t19<-a19.arbitrary; t20<-a20.arbitrary; t21<-a21.arbitrary; t22<-a22.arbitrary
      } yield (t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19, t20, t21, t22))
  
}


/**
Defines zip and resultOf for all arities
*/
object GenArities{
  // resultOf //
  import Arbitrary.arbitrary
  def resultOf[T,R](f: T => R)(implicit a: Arbitrary[T]): Gen[R] = Gen.resultOf(f)
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,R]
    (f: (T1,T2) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,R]
    (f: (T1,T2,T3) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,R]
    (f: (T1,T2,T3,T4) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,R]
    (f: (T1,T2,T3,T4,T5) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,R]
    (f: (T1,T2,T3,T4,T5,T6) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,R]
    (f: (T1,T2,T3,T4,T5,T6,T7) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18,_:T19))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18,_:T19,_:T20))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20], a21:Arbitrary[T21]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18,_:T19,_:T20,_:T21))
    }
  
  /** Takes a function and returns a generator that generates arbitrary
   *  results of that function by feeding it with arbitrarily generated input
   *  parameters. */
  def resultOf[T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22,R]
    (f: (T1,T2,T3,T4,T5,T6,T7,T8,T9,T10,T11,T12,T13,T14,T15,T16,T17,T18,T19,T20,T21,T22) => R)
    (implicit
      a1:Arbitrary[T1], a2:Arbitrary[T2], a3:Arbitrary[T3], a4:Arbitrary[T4], a5:Arbitrary[T5], a6:Arbitrary[T6], a7:Arbitrary[T7], a8:Arbitrary[T8], a9:Arbitrary[T9], a10:Arbitrary[T10], a11:Arbitrary[T11], a12:Arbitrary[T12], a13:Arbitrary[T13], a14:Arbitrary[T14], a15:Arbitrary[T15], a16:Arbitrary[T16], a17:Arbitrary[T17], a18:Arbitrary[T18], a19:Arbitrary[T19], a20:Arbitrary[T20], a21:Arbitrary[T21], a22:Arbitrary[T22]
    ): Gen[R] = arbitrary[T1] flatMap {
      t => resultOf(f(t,_:T2,_:T3,_:T4,_:T5,_:T6,_:T7,_:T8,_:T9,_:T10,_:T11,_:T12,_:T13,_:T14,_:T15,_:T16,_:T17,_:T18,_:T19,_:T20,_:T21,_:T22))
    }
  
}