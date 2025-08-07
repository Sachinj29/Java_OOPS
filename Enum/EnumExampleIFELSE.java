enum Status1{
  Running,Failed,Pending,Success;
}

public class EnumExampleIFELSE{
  public static void main(String args[]){
    
    Status1 s = Status1.Pending;
    
    if(s==Status1.Running){
      System.err.println("All Good");
    }
    else if(s==Status1.Failed){
      System.err.println("Try Again");
    }
    else if(s==Status1.Pending){
      System.err.println("Please Wait");
    }
    else{
      System.err.println("Done");
    }
    
  }
}

