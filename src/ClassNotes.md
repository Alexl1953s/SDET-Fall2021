#Class structure in Java
A *class* in Java is defined by the class keyword. Class are a blueprint, or a set of instructions 
to build a specific type of object. 
It is a basic concept of Object-Oriented Programming which revolve around the real-life entities. 
Class in Java determines how an object will behave and what the object will contain.

All classes in Java must be in a package, we can name the package or else our class will be in the default package.
To declare a package for a class, we will use the *package* statement followed by a package
name.

Class example:
```java
1. package class_structures;
2.
3. public class ClassStructure {
4.    
5. }
```

Java calls a word with special meaning a *keyword*. 
The *public* keyword on line 1 means the class can be used by 
other classes. 
The *class* keyword indicates you’re defining a class. 

*ClassStructure* gives the name of the class.

Package name is *class_structures*.
The package statement cannot be inside or behind the class 
definition, if you put it inside or behind the definition of the class, the code of 
the class will be compiled immediately.
In a class, we can not declare more than once the package statement, if you try to declare, 
then a compile error will occur.

The *import* statement is used to declare the classes to use in our class. 
If the classes we use are in the same package as our class, 
we may NOT need to declare the import statement for these classes.

##main() method

A Java program begins execution with its _main()_ method. A _main()_ method is the gateway 
between the startup of a Java process, which is managed by the **Java Virtual Machine (JVM)**, 
and the beginning of the programmer’s code. The JVM calls on the underlying system to allocate 
memory and CPU time, access files, and so on.
The main() method lets us hook our code into this process, keeping it alive long enough to do the work we’ve coded.

_EX_: 
```java
package class_structures;

public class ClassStructure {
    
    // main() method's signature
    public static void main(String[] args){
        
    }
}
```

###Reserved keywords in Java:
Java has a set of *keywords* that are reserved words that cannot be used 
as variables, methods, classes, or any other identifiers. There are 53 keywords.
EX: public, class, boolean, package, import etc.

#Data Types

*Data types* specify the different sizes and values that can be stored in the variable. 
There are two types of data types in Java:

###Primitive data types

- are pre-defined in Java.
- all primitive type begins with a lowercase letter.
- the size of a primitive type depends on the data type.
- we cannot invoke the method with a primitive type.
- they cannot be null. Primitives always have value.

_Primitive_ data types: The primitive data types include boolean, char, byte, short, int, long, float and double.

###Non-primitive or Reference type

In Java, non-primitive data types are known as reference types. In other words, a variable of class type is called reference data type. It contains the address (or reference) of dynamically created objects. For example, if Demo is a class and we have created its object d, then the variable d is known as a reference type.

It refers to objects. It is not pre-defined. It is created by the programmer if required. The reference types hold the references of objects. All reference types are a subclass of type java.lang.Object. It provides access to the objects stored in the memory.

_Non-primitive_ data types The non-primitive data types include Classes, Interfaces, and Arrays.

- are not pre-defined except the String.
- all reference type begins with Uppercase letter.
- non-primitive types have all the same size.
- they can be used to invoke or call methods.
- they can be null.
- JVM allocates 8 bytes for each reference variable, by default.

There are 8 types of primitive data types:
byte, short, int, long, float, double, boolean, char.

**NOTE:** Java is a statically-typed programming language. It means, all variables must be declared before its use. 
That is why we need to declare variable's type and name. 

###Byte

The byte data type is an example of primitive data type. It is an 8-bit or 1 byte signed two's complement integer. 
Its value-range lies between -128 to 127 (inclusive). Its minimum value is -128 and maximum value is 127. 
Its default value is 0.

The byte data type is used to save memory in large arrays where the memory savings is most required. 
It saves space because a byte is 4 times smaller than an integer. It can also be used in place of "int" data type.

_EX:_ byte numberOfTires = 4;

###Short

The short data type is a 16-bit or 2 bytes signed two's complement integer. Its value-range lies between -32,768 
to 32,767 (inclusive). Its minimum value is -32,768 and maximum value is 32,767. Its default value is 0.

The short data type can also be used to save memory just like byte data type. A short data type is 2 times 
smaller than an integer.

_EX:_ short age = 100;

###int

The int data type is a 32-bit or 4 bytes signed two's complement integer. Its value-range lies between 
-2,147,483,648 (-2^31) to 2,147,483,647 (2^31 -1) (inclusive). Its minimum value is - 2,147,483,648and 
maximum value is 2,147,483,647. 
Its default value is 0.

The int data type is generally used as a default data type for integral values unless if there is no problem 
about memory.

_EX:_ int numberOfShares = 23000;

###long

The long data type is a 64-bit or 8 bytes two's complement integer. Its value-range lies between -9,223,372,036,854,775,808
(-2^63) to 9,223,372,036,854,775,807(2^63 -1)(inclusive). Its minimum value is -9,223,372,036,854,775,808 and 
maximum value is 9,223,372,036,854,775,807. Its default value is 0. The long data type is used when you need a 
range of values more than those provided by int.

When a number is present in the code, it is called a *literal*. By default, Java assumes you are defining an int value with a literal. In this example, the number listed is bigger than what fits in an int. Remember, you aren’t expected to memorize the maximum value for an int. The exam will include it in the question if it comes up.
long max = 3123456789; // DOES NOT COMPILE
Java complains the number is out of range. And it is—for an int. However, we don’t
have an int. The solution is to add the character L to the number: long max = 3123456789L; // now Java knows it is a long

_EX:_ long populationOfWorld = 7_750_000_000L;

###float

The float data type is a single-precision 32-bit IEEE 754 floating point.Its value range is unlimited. It is recommended 
to use a float (instead of double) if you need to save memory in large arrays of floating point numbers. 
The float data type should never be used for precise values, such as currency. Its default value is 0.0F.

_EX:_ float f1 = 234.5f;

###double

The double data type is a double-precision 64-bit IEEE 754 floating point. Its value range is unlimited. The double data 
type is generally used for decimal values just like float. The double data type also should never be used for precise 
values, such as currency. Its default value is 0.0d.

_EX:_ double pi = 3.1415926535 8979323846;

###NOTE:
Double or Float numbers. _EX:_ 12.345;

12 -> is a whole part or integral part;

"." -> decimal point [floating point];

345 -> fractional part;

###Type casting 
NOTE: Takes precedence over mathematical operators

#Java Operators

A Java _operator_ is a special symbol that can be applied to a set of variables, 
values, or literals—referred to as operands—and that returns a result. Three flavors 
of operators are available in Java: _unary, binary_, and _ternary_. 
These types of operators can be applied to one, two, or three operands, respectively. 

Java operators are not necessarily evaluated from _left-to-right_ order. For example, 
the following Java expression is actually evaluated from _right-to-left_ given the specific operators involved.

##Binary Arithmetic Operators

_Binary operators_ by far the most common operators in the Java language. They can be used to perform 
mathematical operations on variables, create logical expressions, as well as perform basic variable assignments. 
Binary operators are commonly combined in complex expressions with more than _two variables_; therefore, _operator 
precedence_ is very important in evaluating expressions.


##Arithmetic operators

_Arithmetic operators_ are often encountered in early mathematics and include addition
(+), subtraction (-), multiplication (*), division (/), and modulus (%).

EX: double num = 2 + 3 * (1 + 6);
On this example the order is as follows: 1- parenthesis; 2- multiplication; 3- addition; and 4- the result gets 
upcasted from int to double and gets assigned to _num_. And this is called _order of operation_ by decreasing
the order of _operator precedence_. If two operators have the same level of precedence, 
then Java guarantees _left-to-right_ evaluation.

_Multiplicative_ operators (*, /, %) have a higher order of precedence than the _additive_ operators (+, -).
EX: int x = 2 * 5 + 3 * 4 - 8;
you first evaluate the 2 * 5 and 3 * 4, which reduces the expression to the following: int x = 10 + 12 - 8; <br>
Then, you evaluate the remaining terms in _left-to-right_ order, resulting in a value of x of 14.

All of the arithmetic operators may be applied to any Java primitives, except _boolean_ and _String_. Furthermore, 
only the addition operators + and += may be applied to String values, which results in _String concatenation_.

One more Arithmetic operator is _modulus_. The _modulus_, or _remainder operator_, is simply the remainder when two 
numbers are divided. For example, 9 divided by 3 divides evenly and has no remainder; therefore, the remainder, 
or 9 % 3, is 0. On the other hand, 11 divided by 3 does not divide evenly; therefore, the remainder, or 11 % 3, is 2.

###_Numeric Promotion Rules_
1. If two values have different data types, Java will automatically promote one of the val- ues to the larger 
   of the two data types.
2. If one of the values is integral and the other is floating-point, Java will automatically promote the 
   integral value to the floating-point value’s data type.
3.  Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java 
    binary arithmetic operator, even if neither of the operands is int.
4.  Smaller data types, namely byte, short, and char, are first promoted to int any time they’re used with a Java 
    binary arithmetic operator, even if neither of the operands is int.
    After all promotion has occurred and the operands have the same data type, the result- ing value will have 
    the same data type as its promoted operands.
    
EX: What is the data type of _x * y / z_ ? <br>
short x = 14; <br>
float y = 13; <br>
double z = 30; <br>
In this case, we must apply all of the rules. First, x will automatically be promoted to int solely because it is a 
short and it is being used in an arithmetic binary operation. The promoted x value will then be automatically promoted 
to a float so that it can be multiplied with y. The result of x * y will then be automatically promoted to a double, 
so that it can be multiplied with z, resulting in a double value.

##Unary Operators

A _unary operator_ is one that requires exactly _one_ operand, or variable, to function.


