#EXCERCISES.

#INTRODUCTION TO JAVA
	Hello World
	The purpose of this exercise is to verify that you know how to run a basic Java application. 
Exercise steps: <br/>
1.	Create a Java package called exercises .<br/>
2.	Inside the exercises package, create another package (subpackage) called java<br/>
3.	Create a Java class called Exercise1 inside the java package.<br/>
4.	Insert a main() method inside the Excercise1 class.<br/>
5.	Inside the main() method, insert this statement: <br/>
System.out.println("Hello World"); <br/>
6.	Compile and run the main() method of the Excercises1 class.<br/>



#VARIABLES AND OPERATORS
	Using Variables
	The purpose of this exercise is to know how to declare and use variables in Java.
	Exercise: 
1.	How to declare primitive and non-primitive data types<br/>

	Variables Scopes<br/>
Exercise:<br/>
1. Declare a variable with a Class Level scope.<br/>
2. Declare a method scope variable<br/>
3. Declare a variable with a Loop level Scope<br/>

	Primitive Types
1. Declare correctly all primitive Java variables:<br/>
	Operators<br/>
1. Mention and declare the five types of operators allowed in Java:<br/>
Strings<br/>
1. Declare two different ways to create Strings <br/>

Arrays<br/>
1.	Declare the different ways to initialize and assign a value to a one dimensional Arrays.<br/>




#CLASSES<br/>
	Creating a Class.
1. Create in code a simple and small ecosystem based on animal object and their different types of animal classes and define a common behavior between them.<br/>
	Using methods<br/>
1. Declare an Overriding Method with Java code.<br/>
2. Declare an overloading method with Java code.<br/>

	Constructors<br/>
1. Making a constructor.<br/>
2. Overloading a constructor.<br/>
3. Using the default constructor.<br/>

	Access Modifiers<br/>
1. Write code to show how to apply access modifiers in Java.<br/>






#CONTROL STATEMENTS<br/>
	Transfer of control Statements
1. From following code, provide the correct output;<br/>
int th = 0;<br/>
int daf = 4;<br/>
for (int i=1; i<25;i++){<br/>
	th = ++th;<br/>
	if(th > daf)<br/>
		break;<br/>
	System.out.println(“Fishing for hour ”+ i);<br/>
}<br/>

2. From following code, provide the correct output:<br/>
Int tdc = 0;<br/>
Int daf = 5;<br/>
for (int i=1; i<8; ++i){<br/>
	System.out.println(“\nDay ”+ i + “: camping”);<br/>
	tdc = ++tdc;<br/>
	if(tdc > daf)<br/>
		continue;<br/>
	System.out.println(“and Fishing“);<br/>
}<br/>

2. Decode a code with a return statement.<br/>

	Flow control Statements.<br/>
1. What is the value of b at the end of this code:<br/>
foo () {<br/>
	int b = 1;<br/>
	b++;<br/>
}<br/>







#INHERITANCE AND COMPOSITION<br/>
	Inheritance
1. Create the code based on the following Class Diagram (just consider the constructor method creation):<br/>
 
	Composition<br/>
1. Write the Book class (which uses the Author class written earlier). Also write a test driver called TestBook to test all the public methods in the class Book. Take Note that you have to construct an instance of Author before you can construct an instance of Book<br/>
 
	Polymorphism<br/>
1. Write a test class to test these statements involving polymorphism and explain the outputs. Some statements may trigger compilation errors. Explain the errors, if any.<br/>

	Interfaces.<br/>
1. Write a class that implements the CharSequence interface found in the java.lang package. Your implementation should return the string backwards. Select one of the sentences from this book to use as the data. Write a small main method to test your class; make sure to call all four methods.<br/>




#GENERICS<br/>

1. Elimiation of casts. Re-write the following code to use generics, the code does not require casting:<br/>
List list = new ArrayList();<br/>
list.add("hello");<br/>
String s = (String) list.get(0);<br/>

