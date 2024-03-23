# Scala-Tutorial
## REPL
REPL stands for Read Evaluate Print Loop, and it is a programming language environment (basically a console window) that takes single expression as user input and returns the result back to the console after execution.

## Unit
This is a datatype which is equivalent to void in JAVA
## Literals in Scala
- In Java
```
final int a = 12;
```
- In Scala
```
val a: Int = 12;
```
## Operator Overloading
In Scala we can overload an operator unlike what we could in java. In other words since everything is an object in Scala we can make the operators in the form of a function as well. In the following example we will be performing a **minus operation** with the help of a **plus operator**.
```
object OperatorOverloading{
  case class OO(x: Int){
    def +(obj: OO):Int = {
      return x-obj.x
    }
  }
  
  def main(arg: Array[String]): Unit = {
    var obj1=OO(2);
    var obj2=OO(3);
    
    println(obj1.+(obj2));
  }
}
```
## Any
This is another datatype which is found in cases involving arrays containing different types of datatype. For example:
```
var x=List(1,2,"hello")
```
The type of this **x** variable will be **Any**. Now **Any** is on top of the hierarchy and its two child are **AnyValue** and **AnyRef**. Subclasses of **AnyValue** are Numeric Types, Char and Boolean. Subclasses of **AnyRef** are Collections, Classes and String.

## Codes
1. <a href="https://github.com/abirbhattacharya82/Scala-Tutorial/blob/main/HelloWorld.scala">Hello World</a>
2. <a href="https://github.com/abirbhattacharya82/Scala-Tutorial/blob/main/AdditionOfTwoNumbers.scala">Addition of Two Numbers</a>
3. <a href="https://github.com/abirbhattacharya82/Scala-Tutorial/blob/main/AdditionOfTwoNumbers.scala">Classes and Constructors</a>
4. <a href="https://github.com/abirbhattacharya82/Scala-Tutorial/blob/main/ComparingTwoObjects.scala">Comparing Two Objects</a>
5. <a href="https://github.com/abirbhattacharya82/Scala-Tutorial/blob/main/LambdaExpressions.scala">Lambda Expressions</a>
6. <a href="https://github.com/abirbhattacharya82/Scala-Tutorial/blob/main/ReversingString.scala">Reversing String</a>
7. <a href="https://github.com/abirbhattacharya82/Scala-Tutorial/blob/main/DataManipulationWithObjects.scala">Data Manipulation with Objects</a>