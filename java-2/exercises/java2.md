#EXCERCISES JAVA2.

#EXCEPTIONS.

## 1.-Can you spot the compile-time error in the following Java program?<br/>

import java.io.*;<br/>
public class test {<br/>
    public static void main(String[] args) {<br/>
        try {<br/>
            FileReader fr = new FileReader("data.txt");<br/>
        }<br/>
        catch(IOException e){}<br/>
        try {<br/>
            fr.close();<br/>
        }<br/>
        catch(IOException e){}<br/>
    }<br/>
}<br/>

## 2.-What will be the output of the program?<br/>
try <br/>
{ <br/>
    int x = 0; <br/>
    int y = 5 / x; <br/>
} <br/>
catch (Exception e) <br/>
{<br/>
    System.out.println("Exception"); <br/>
} <br/>
catch (ArithmeticException ae) <br/>
{<br/>
    System.out.println(" Arithmetic Exception"); <br/>
} <br/>
System.out.println("finished");<br/>

A.	finished<br/>
B.	Exception<br/>
C.	Compilation fails.<br/>
D.	Arithmetic Exception<br/>


## 3.-What will be the output of the program?<br/>
public class MyProgram <br/>
{<br/>
    public static void main(String args[])<br/>
    {<br/>
        try <br/>
        {<br/>
            System.out.print("Hello world ");<br/>
        }<br/>
        finally <br/>
        {<br/>
            System.out.println("Finally executing ");<br/>
        }<br/>
    }<br/>
}<br/>

A.	Nothing. The program will not compile because no exceptions are specified.<br/>
B.	Nothing. The program will not compile because no catch clauses are specified.<br/>
C.	Hello world.<br/>
D.	Hello world Finally executing<br/>


#COLLECTIONS

## 1.-Provides a clean syntax for looping over the elements of a Set, List, array, or other collection<br/>
Set<Double> grades = new HashSet<Double>();<br/>

## 2.-Set and Ordering. Define the way how the HashSet, TreeSet and LinkedHashSet collections handle the next elements:<br/>
Set<String> names = new …<String>();<br/>
names.add("Jake");<br/>
names.add("Robert");<br/>
names.add("Marisa");<br/>
names.add("Kasey");<br/>
System.out.println(names);<br/>

## 3.-Write a program that prints its arguments in random order. Do not make a copy of the argument array. Demonstrate how to print out the elements using both streams and the traditional enhanced for statement. <br/>

#ENUMERATIONS

## 1.-Write the code for a simple enum example.<br/>

## 2.-Write enums code in a switch statements<br/>

## 3.-Write an example to iterate all values of an enum.<br/>

#IO

## 1.-Write an example that counts the number of times a particular character, such as e, appears in a file. The character can be specified at the command line.<br/>

## 2.-Create a new directory by using File object<br/>

## 3.-Which one of the following will create an InputStreamReader correctly?<br/>
1.	new InputStreamReader(new FileInputStream("data"));<br/>
2.	new InputStreamReader(new FileReader("data"));<br/>
3.	new InputStreamReader(new BufferedReader("data"));<br/>
4.	new InputStreamReader("data");<br/>
5.	new InputStreamReader(System.in);<br/>
