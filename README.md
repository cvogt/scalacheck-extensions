## Scalacheck extensions

>= 2.11 only

### SBT settings

    libraryDependencies += "org.cvogt" %% "scalacheck-extensions" % "0.2"

### Fully automatic tree / class hierarchy generators 

Usage see [GenTreeTest.scala](src/test/scala/GenTreeTest.scala)

Also see: https://github.com/rickynils/scalacheck/pull/152

### Arbitrary instance for arbitrary tuple and function arities

(Will be part of official scalacheck >= 1.12.3)

See [Arities.scala](src/main/scala/Arities.scala)
