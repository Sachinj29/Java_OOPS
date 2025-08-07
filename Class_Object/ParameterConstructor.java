//Java Program to demonstrate the use of the parameterized constructor.    
class Student{    
    int id;    
    String name;    
    //creating a parameterized constructor    
    Student(int i,String n){    
    id = i;    
    name = n;    
    }    
    //method to display the values    
    void display(){System.out.println(id+" "+name);}    
}  
//Main class to create objects and class methods  
public class ParameterConstructor{  
    public static void main(String args[]){    
    //creating objects and passing values    
    Student s1 = new Student(29,"Sachin Jadhav");    
    Student s2 = new Student(24,"Samrat mali");    
    //calling method to display the values of object    
    s1.display();    
    s2.display();    
   }    
} 