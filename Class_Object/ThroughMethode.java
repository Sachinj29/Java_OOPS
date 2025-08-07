/*2) Object Initialization through Method
In this example, we are creating the two objects of Student class and initializing the value to these objects by invoking the insertRecord method.

Here, we are displaying the state (data) of the objects by invoking the displayInformation() method.*/


class Student{    
 int rollno;    
 String name;    
 //Creating a method to insert record  
 void insertRecord(int r, String n){    
  rollno=r;    
  name=n;    
 }    
 //creating a method to display information  
 void displayInformation(){System.out.println(rollno+" "+name);}    
}  
  
//Creating a Main class to create objects and call methods  
public class ThroughMethode{    
 public static void main(String args[]){    
  Student s1=new Student();    
  Student s2=new Student();    
  s1.insertRecord(13,"Sachin");    
  s2.insertRecord(11,"Samrat");    
  s1.displayInformation();    
  s2.displayInformation();    
 }    
}  