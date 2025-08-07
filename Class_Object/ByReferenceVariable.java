/*
Initializing an Object in Java
There are the following three ways to initialize an object in Java:

By Reference Variable
By Method
By Constructor

1) Object Initialization through Reference Variable
Initializing an object means storing data in the object. Let's see a simple example where we are going to initialize the object through a reference variable.

*/



class Student{    
 int id;    
 String name;    
} 

public class ByReferenceVariable{    
 public static void main(String args[]){    
  //Creating instance of Student class  
  Student s1=new Student();    
  //assigning values through reference variable  
  s1.id=29;    
  s1.name="Sachin Jadhav";    
  //printing values of s1 object  
  System.out.println(s1.id+" "+s1.name);    
 }    
}    