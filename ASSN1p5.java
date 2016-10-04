////////////////////////////////////////////////////////////////////////////
//
// Tristan Goers
// Assignment 1, Part 5
// 9/12/2016
//
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// DESCRIPTION: Short quiz that gives a score at the end
//
// INPUTS: answers to multiple choice questions (x3)
// 
//
// OUTPUTS: Score
// 
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;

public class ASSN1p5
{
  public static void main(String[] args)
  {
    int X = 0;
    //Q1
    System.out.println("Which of the following would give an output of 10?");
    System.out.println("A . 2+2+2+2+2"); //CORRECT
    System.out.println("B . (5*2)-1");
    System.out.println("C . 20-11");
    
    Scanner a = new Scanner(System.in);
    if(a.next().equals("A"))
    {
      X++;
      System.out.println("Plus 1");
    }
    else
    {
      X=X+0;
       System.out.println("Plus 0");
    }
    
    //Q2
    System.out.println("Which of the following would give an output of 20?");
    System.out.println("A . (2+2+2+2+2)*2"); //CORRECT
    System.out.println("B . (5*2)-1");
    System.out.println("C . 20-11");
       
    Scanner b = new Scanner(System.in);
    if(b.next().equals("A"))
    {
      X++;
      System.out.println("Plus 1");
    }
    else
    {
      X=X+0;
      System.out.println("Plus 0");
    }
    
    //Q3
    System.out.println("Which of the following would give an output of 30?");

    System.out.println("A . 10+((2+2+2+2+2)*2)"); //CORRECT
    System.out.println("B . (5*2)-1");
    System.out.println("C . 20-11");
   
    Scanner c = new Scanner(System.in);
    if(c.next().equals("A"))
    {
      X++;
      System.out.println("Plus 1");
    }
    else
    {
      X=X+0;
      System.out.println("Plus 0");
    }
    System.out.println(X);
  }
}
    