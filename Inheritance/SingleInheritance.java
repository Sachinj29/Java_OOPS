
class Animal{
  void eat(){
    System.out.println("Im Eating.");
  }
}

class Dog extends Animal{
  void bark(){
    System.out.println("Dog is Barking");
  }
}


class SingleInheritance{
  public static void main(String args[]){

    Dog D = new Dog();
    D.eat();
    D.bark();
  }
}