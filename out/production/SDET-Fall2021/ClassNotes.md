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