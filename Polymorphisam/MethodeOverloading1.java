/*2) Method Overloading: By changing data type of arguments
Method overloading in Java also allows changing the data type of arguments in the method signature. Here's an example demonstrating method overloading based on the data type of arguments: In this example, we have created two methods that differs in data type. The first add method receives two integer arguments and second add method receives two double arguments.

Example
*/

// Class Adder contains overloaded methods to add numbers    
class Adder1 {    
    // Method to add two integers    
    static int add(int a, int b) {    
        return a + b;    
    }    
    // Method to add two doubles    
    static double add(double a, double b) {    
        return a + b;    
    }    
}    
public class MethodeOverloading1 {    
    public static void main(String[] args) {    
        // Calling the add method with two integers    
        System.out.println(Adder1.add(11, 11)); // Output: 22         
        // Calling the add method with two doubles    
        System.out.println(Adder1.add(12.3, 12.6)); // Output: 24.9    
    }    
}