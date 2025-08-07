/*Java Copy Constructor
Java does not support the copy constructor. However, we can copy the values from one object to another, like a copy constructor in C++.

There are the following three ways to copy the values of one object into another:

By Using a Constructor
By Assigning the Values of One Object to Another
By Using the clone() Method of the Object Class

*/

//Java program to initialize the values from one object to another object.    
class Student{    
    int id;    
    String name;    
    //constructor to initialize integer and string    
    Student(int i,String n){    
    id = i;    
    name = n;    
    }    
    //constructor to initialize another object    
    Student(Student s){    
    id = s.id;    
    name =s.name;    
    }  

    void display(){
      System.out.println(id+" "+name);
    }    
}  


public class CopyConstructor{  
    public static void main(String args[]){    
    Student s1 = new Student(29,"Sachin");    
    Student s2 = new Student(s1);    
    s1.display();    
    s2.display();    
   }    
} 