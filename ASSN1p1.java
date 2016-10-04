////////////////////////////////////////////////////////////////////////////
//
// Tristan Goers
// Assignment 1, PART 1
// September 7, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// DESCRIPTION: This program converts miles per hour (mph)  to minutes per mile
//
// INPUTS: mph = some speed
//
// OUTPUTS: minutes per mile
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
public class ASSN1p1 
{
  public static void main(String[] args)
  {
    //mph = miles per hour
    //hpm = hours per mile
    //mpm = minuetes per mile
    //int_mpm = Integer value of mpm
    //rem_mpm = remainding minutes per mile
    //sec = seconds
    //min = int_mpm
    
   double mph = 7.7;
   double hpm;
   double mpm;
   int int_mpm;
   double rem_mpm;
   double sec;
   int min;
   
   hpm = 1/mph;
   mpm = hpm*60;
   int_mpm = (int)mpm;
   rem_mpm = mpm - int_mpm;
   sec = rem_mpm*60;
   min = int_mpm;
   
   System.out.println(min + " minutes and " + sec + " seconds.");
  }
}