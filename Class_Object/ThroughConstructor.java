/*Object Initialization through a Constructor
The concept of object initialization through a constructor is essential to object-oriented programming in Java. Special methods inside a class called constructors are called when an object of that class is created with the new keyword. They initialise the state of objects by entering initial values in their fields or carrying out any required setup procedures. The constructor is automatically invoked upon object instantiation, guaranteeing correct initialization of the object prior to usage.

If you are a beginner, skip this part because we will learn about the constructor later.

Here's an example demonstrating object initialization through a constructor.*/


class Student {    
    int id;    
    String name;    
    // Constructor with parameters    
    public Student(int id, String name) {    
        this.id = id;    
        this.name = name;    
    }    
    // Method to display student information    
    public void displayInformation() {    
        System.out.println("Student ID: " + id);    
        System.out.println("Student Name: " + name);    
    }    
}    
public class ThroughConstructor {    
    public static void main(String[] args) {    
        // Creating objects of Student class with constructor    
        Student student1 = new Student(1, "Sachin Jadhav");    
        Student student2 = new Student(2, "Samrat Mali");    
        // Displaying information of the objects    
        student1.displayInformation();    
        student2.displayInformation();    
    }    
}   