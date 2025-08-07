

class Cal{
  public int result(int n, int m){
    return n+m;
  }
}

class AdCal extends Cal{
   public int result(int n, int m){
    return n+m+1;
  }
}


public class MethodeOverloading2{
  public static void main(String args[]){

    AdCal A = new AdCal();
   int r = A.result(5,4);
   System.err.println(r);
  }
}