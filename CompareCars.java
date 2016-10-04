public class CompareCars
{
  


  


  
  
  
  public static void main(String[] args)
  {   
    car Civic = new car();
    Civic.setName("Civic");
    Civic.setMPG(35);
    
    
    
    car F350 = new car();
    F350.setName("F350");
    F350.setMPG(15);
    
    if(Civic.getMPG() > F350.getMPG())
      System.out.println("Civic is more efficient");
    else
      System.out.println("F350 is more efficient");
  }
}