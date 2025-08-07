
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

class BabyDog extends Animal{
  void bark1(){
    System.out.println("Im a Baby Dog");
  }
}



class HerarchicalInheritance{
  public static void main(String args[]){

    BabyDog D = new BabyDog();
    D.eat();
    //D.bark();                 Show error 
    D.bark1();
  }
}



