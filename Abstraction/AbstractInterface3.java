


interface Printable{    
void print();    
} 


interface Showable extends Printable{    
void show();    
} 


class AbstractInterface3 implements Showable{    
public void print(){System.out.println("Hello");}    
public void show(){System.out.println("Welcome");}    
    
public static void main(String args[]){    
AbstractInterface3 obj = new AbstractInterface3();    
obj.print();    
obj.show();    
 }    
}   


