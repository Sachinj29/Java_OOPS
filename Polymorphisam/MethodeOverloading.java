/*1) Method Overloading: By changing no. of arguments
Method overloading in Java allows defining multiple methods with the same name but different parameter lists. One common form of overloading is changing the number of arguments in the method signature. In this example, we have created two methods, the first add() method performs addition of two numbers, and the second add method performs addition of three numbers.

In this example, we are creating static methods so that we don't need to create instance for calling methods.

Example
*/
// Class Adder contains overloaded methods to add integers    
class Adder {    
    // Method to add two integers    
    static int add(int a, int b) {    
        return a + b;    
    }    
    // Method to add three integers    
    static int add(int a, int b, int c) {    
        return a + b + c;    
    }    
}    
public class MethodeOverloading {    
    public static void main(String[] args) {    
        // Calling the add method with two integers    
        System.out.println(Adder.add(11, 11)); // Output: 22    
        // Calling the add method with three integers    
        System.out.println(Adder.add(11, 11, 11)); // Output: 33    
    }    
}    