////////////////////////////////////////////////////////////////////////////
//
// Your Name Here
//  Lab 3 Exercise
// September 2016
//
////////////////////////////////////////////////////////////////////////////

import java.util.*;

//////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  DESCRIPTION: This program does the following:
//                      1. Prompts the user to enter the results of eight coin tosses.
//                      2. Counts the number of heads and the number of tails.
//                      3. Displays the total number of heads and the total number of tails.
//                      4. Calculates and displays the percentages of heads and tails.
//
//
// INPUTS:  Interactively reads a single char value for each of the eight coin tosses.
//                      'h' represents heads and 't' represents tails.
//
// OUTPUTS: The total number of heads, the total number of tails, and the percentage of
//                      heads and tails are displayed to the screen.
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////

public class CoinToss
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String response;
        char tossResults;
        int headCount = 0, //Must initialize to 0 to ensure correct results
            tailCount = 0;

        System.out.println("\n\nEnter either h for heads or t for tails");
        System.out.println("for eight coin tosses:\n");

        
        System.out.print("First toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
         headCount++;
        if(tossResults == 't')
         tailCount++;

        System.out.print("Second toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
         headCount++;
        if(tossResults == 't')
         tailCount++;

        System.out.print("Third toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
         headCount++;
        if(tossResults == 't')
         tailCount++;

        System.out.print("Fourth toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
         headCount++;
        if(tossResults == 't')
         tailCount++;

        System.out.print("Fifth toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
         headCount++;
        if(tossResults == 't')
         tailCount++;

        System.out.print("Sixth toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
         headCount++;
        if(tossResults == 't')
         tailCount++;

        System.out.print("Seventh toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
         headCount++;
        if(tossResults == 't')
         tailCount++;

        System.out.print("Eighth toss: ");
        response = keyboard.nextLine();
        tossResults = response.charAt(0);

        if(tossResults == 'h')
         headCount++;
        if(tossResults == 't')
         tailCount++;




    }
}
