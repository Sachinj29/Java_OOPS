enum Laptop{
  Mackbook(10000),XPS(70000),Surface(50000),Hp(40000);

    public static Laptop getMackbook() {
        return Mackbook;
    }

    public static Laptop getXPS() {
        return XPS;
    }

    public static Laptop getSurface() {
        return Surface;
    }

    public static Laptop getHp() {
        return Hp;
    }

  private int price;
  private Laptop(int price){
    this.price = price;
  }

    public int getPrice() {
        return price;
    }

  
}


public class InnerClass{
  public static void main(String args[]){
    Laptop l =  Laptop.Mackbook;
    //System.out.println(l);
    System.out.println(l +" : " + l.getPrice());


    for(Laptop lap : Laptop.values()){
    System.out.println(lap+ " : " +lap.getPrice());
  }
  }
}