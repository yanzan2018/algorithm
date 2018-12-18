production code:
1 Exception handling
2 Boundary condition 
Concurrency handling

http://www.java67.com/2013/07/15-advanced-core-java-interview-questions-answers-senior-experienced-5-6-years-programmers-developers.html

https://javarevisited.blogspot.com/2010/10/why-string-is-immutable-or-final-in-java.html#axzz5YGMrZ58U


# basic knowledge:
 ## input
 An InputStream is the raw method of getting information from a resource. It grabs the data byte by byte without performing any kind of translation. If you are reading image data, or any binary file, this is the stream to use.

A Reader is designed for character streams. If the information you are reading is all text, then the Reader will take care of the character decoding for you and give you unicode characters from the raw input stream. If you are reading any type of text, this is the stream to use.

## type casting
We can convert int to double in java using assignment operator. There is nothing to do extra because lower type can be converted to higher type implicitly.

## Java对象数组在new的时候不要写泛型，但在定义的时候需要写。

 ## Common Interface
  ### Collection interface <java.util>   (VS class Collections)
      Sub interface: List, Set, Deque
      Implemented classes: 
        List -> ArrayList, LinkedList, Stack, Vector
        Set -> HashSet, TreeSet
        Deque  -> LinkedList
 ### Iterable interface <java.lang>   (VS Interface Iterator in java. util)
 
 ## overload/override
 ### overload https://www.geeksforgeeks.org/different-ways-method-overloading-java/
 ### override https://www.geeksforgeeks.org/overriding-in-java/
 
 package test.com;

public class OverloadTest {
	public int foo() { return 10; } 
	  
    // compiler error: foo() is already defined 
    //public char foo() { return 'a'; } 
	//right
	//public int foo(int a) {return 11;}
	public char foo(int a) {return 12;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

 
 ## interview exercise
 
 https://tests4geeks.com/java-interview-questions/
    
    
    
    
  
  
