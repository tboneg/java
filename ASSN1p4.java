////////////////////////////////////////////////////////////////////////////
//
// Tristan Goers
// Assignment 1, Part 4
// 9/12/2016
//
////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// DESCRIPTION: This program determines what type of hair you should get
//
// INPUTS: Male/Female, Superhero/Supervillain, Steak/Suchi
//
// OUTPUTS: The type of hair one should get
// 
//
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



import java.util.Scanner;

public class ASSN1p4 
{
  public static void main(String[] args)
  {
   
    System.out.println("Male or Female?");
    Scanner a = new Scanner(System.in);
    if(a.next() == "Male");
    {
      System.out.println("Superhero or Supervillain?");
     Scanner b = new Scanner(System.in);
      if(b.next() == "Superhero");
      {
        System.out.println("Steak or Suchi");
       Scanner c = new Scanner(System.in);
       if(c.next() == "Steak");
        //else
        {
          System.out.println("You should get a flat top");

        }
        if(c.next() == "Suchi")
       // else
        { 
          System.out.println("You should get a pompadour");
        }

      }
      if(b.next() == "Supervillain")
      { 
        System.out.println("You should get a mohawk");
      }
    }
    if(a.next() == "Female");
    {
      System.out.println("Superhero or Supervillain?");
       Scanner d = new Scanner(System.in);
      if(d.next() == "Superhero");
      {
        System.out.println("Anime or Sitcom?");
        Scanner e = new Scanner(System.in);
        if(e.next() == "Anime");
        {
          System.out.println("You should go with bangs");

        }
        if(e.next() == "Sitcom");
        { 
          System.out.println("You should get a bob");
        }

      }
      if(d.next() == "Supervillain");
      {
        System.out.println("You should get a mohawk");
      }
    }
  }
}

    

    
    
    
    
    