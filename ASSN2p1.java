////////////////////////////////////////////////////////////////////////////
//
// Tristan Goers
// Assignment 2, PART 1
// September 30, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// DESCRIPTION: Finds the number that was asked for
//
// INPUTS: a,b,c,d
//
// OUTPUTS: full number.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 


public class ASSN2p1
{
  public static void main(String[] args)
  {
    int a=1,b=0,c=1,d=0;
    
    while(a != c*3 && a+b+c+d <=27 && a<=9 && c<9)
    {
      c++;
      if(a != c*3 && a <=9 && c<=9)
      {
       c++;
       a = c*3;
      }

//----------------------------------------------------
      int sum = a+c;
      
      int sum2 = 27 - sum;
//----------------------------------------------------
      int div = sum2 / 2;
      b = div + div%2;
      d = div;

    }
      
    
    System.out.println("Number: " + a+b+c+d);
    System.out.println("Sum: " + (a+b+c+d));
    System.out.println("a: " + a);
    System.out.println("b: " + b);
    System.out.println("c: " + c);
    System.out.println("d: " + d);
  }
}
