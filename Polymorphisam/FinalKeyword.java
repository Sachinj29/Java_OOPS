/*final keyword in Java

The final keyword in Java is used to restrict the user. It is also known as a non-access modifier. We can use the final keyword with:

Variable
Method
Class
Parameter
*/


/*class FinalVariable {    
  final int SPEED_LIMIT=90;    //final variable    
  void run() {    
   SPEED_LIMIT=400;   //we cannot change the final variable    
  }    
  public static void main(String args[]) {    
  Main obj=new  Main();    
  obj.run();    
  }    
 }   */




//  2) Java final Method
// A method declared as final is known as a final method. Subclasses cannot override the final method.  

// Syntax:

// final void paint() {  
// }  
// Example of final Method
// Example


/*class Bike {    
  final void run() {   //final method  
   System.out.println("running"); }    
}    
public class Main extends Bike {    
   //We cannot override the final method    
   void run(){System.out.println("running safely with 100kmph");  
}    
    public static void main(String args[]) {    
   Main obj= new Main();    
   obj.run();    
   }    
}   */



/* 3) Java final Class
A class declared with the final keyword is known as a final class. Note that the final class cannot be inherited.

Syntax:

final class Square {  
//statement   
}  
Example of final Class
Example




final class Bike {}    
//We cannot inherit the final class    
public class Main extends Bike   
{    
   void run()  
   {  
       System.out.println("running safely with 100kmph");     
   }    
     public static void main(String args[])   
     {    
       Main obj = new Main();    
       obj.run();    
   }    
}    




When we compile the above code, it shows a compile-time error, as follows:

Main.java:3: error: cannot inherit from final Bike
public class Main extends Bike
^
1 error
Q) Can we inherit final method?
Ans) Yes, the final method can be inherited, but we cannot override it. For Example:

Example
class Bike  {    
  final void run() { System.out.println("running...");   }    
}    
public class Main extends Bike  {    
   public static void main(String args[])  {    
    new Main().run();    
   }    
}    
   
*/