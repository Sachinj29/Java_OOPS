/*
An interface in Java is a blueprint of a class. It has static constants and abstract methods.

The interface in Java is a mechanism to achieve abstraction. There can be only abstract methods in the Java interface, not a method body. It is used to achieve abstraction and multiple inheritance in Java.

In other words, we can say that interfaces can have abstract methods and variables. It cannot have a method body.

Java Interface also represents the IS-A relationship.
It cannot be instantiated just like the abstract class.
*/


//Creating an interface 

interface Printable{      
  void print();      
}    

//Creating a class that implements Printable    
class Printer implements Printable{      
  public void print(){System.out.println("Hello");}   
} 

//Creating a class that creates objects and call methods  
public class AbstractInterface{  
  public static void main(String args[]){      
    Printable p=new Printer();  
    p.print();    
 }      
}      
