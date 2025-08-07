//Java Program to illustrate how to define a class and fields    
//Defining a Student class.   
 
class ClassObj{    
 //defining fields    
 int id = 29;//field or data member or instance variable    
 String name = "Sachin Jadhav";   
} 



 //creating main method inside the Student class    
class ClasObject1{
 public static void main(String args[]){    
  //Creating an object or instance    
  ClassObj s1=new ClassObj();//creating an object of Student    
  //Printing values of the object    
  System.out.println(s1.id);//accessing member through reference variable    
  System.out.println(s1.name);    
 }    
}
  