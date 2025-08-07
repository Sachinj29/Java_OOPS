/* 
A Constructor in Java is a block of codes like the method. It is called when an instance of the class is created. At the time of calling constructor, memory for the object is allocated in the memory. It is a special type of method which is used to initialize the object.

Rules for Creating Java Constructor
There are the following rules for defining a constructor:

Constructor name must be the same as its class name.
A Constructor must have no explicit return type.
A Java constructor cannot be abstract, static, final, and synchronized.Types of Java Constructors
There are two types of constructors in Java:

Default Constructor (No-arg constructor)
Parameterized Constructor
*/



//Java Program to create and call a default constructor    
class Bike{    
    //creating a default constructor    
    Bike(){
      System.out.println("Bike is created");
    }
}  

public class DefaultConstructor{  
    //main method    
    public static void main(String args[]){    
        //calling a default constructor    
        Bike b=new Bike();    
    }    
}    