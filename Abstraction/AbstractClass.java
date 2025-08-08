
/*
Abstraction is a process of hiding the implementation details and showing only functionality to the user.

Another way, it shows only essential things to the user and hides the internal details, for example, sending SMS where we type the text and send the message. We do not know the internal processing about the message delivery.

There are two ways to achieve abstraction in Java:

Using Abstract Class (0 to 100%)

Using Interface (100%)

Abstract Class in Java
An abstract class in Java acts as a partially implemented class that itself cannot be instantiated. It exists only for subclassing purposes, and provides a template for its subcategories to follow. Abstract classes can have implementations with abstract methods. Abstract methods are declared to have no body, leaving their implementation to subclasses.

Points to Remember
An abstract class must be declared with an abstract keyword.
It can have abstract and non-abstract methods.
It cannot be instantiated.
It can have constructors and static methods also.
It can have final methods which will force the subclass not to change the body of the method.

*/



//Creating an abstract class having abstract method  
abstract class Bike{    
  abstract void run();    
}   


//Creating a child class and override abstract method  
class Honda extends Bike{    
void run()
 {
   System.out.println("running safely");
 }    
}  


//Creating a Main class to create object and call methods  
public class AbstractClass{  
public static void main(String args[]){    
 Bike obj = new Honda();    
 obj.run();    
}    
}   
