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

###Reserved keywords in Java:
Java has a set of *keywords* that are reserved words that cannot be used 
as variables, methods, classes, or any other identifiers. There are 53 keywords.
EX: public, class, boolean, package, import etc.

#Data Types

*Data types* specify the different sizes and values that can be stored in the variable. 
There are two types of data types in Java:

_Primitive_ data types: The primitive data types include boolean, char, byte, short, int, long, float and double.

_Non-primitive_ data types: The non-primitive data types include Classes, Interfaces, and Arrays.

There are 8 types of primitive data types:
byte, short, int, long, float, double, boolean, char.

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

