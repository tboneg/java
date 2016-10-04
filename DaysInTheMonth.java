import java.util.Scanner;

public class DaysInTheMonth
{
 public static void main(String[] args)
 {
  String month;
  int days;
  char answer;
  Scanner keyboard = new Scanner(System.in);

  System.out.print("Enter the name of a month,\n" +
     "and I'll tell you how many days are in it: ");
  month = keyboard.nextLine().toLowerCase();

  switch (month)
  {
   case "september":
   case "april":
   case "june":
   case "november":
    days = 30;
    break;
   case "february":
    System.out.print("Is it a leap year? (Y/N): ");
    answer = keyboard.nextLine().toLowerCase().charAt(0);
    if(answer == 'y')
      days = 29;
    else
      days = 28;
    break;
    
    
   /* 
    switch (answer)
    {
     case 'y':
      days = 29;
      break;
     default:
      days = 28;
      break;
    }
    */
    
    
    case "january":
    case "march":
    case "may":
    case "july":
    case "august":
    case "october":
    case "december":
      days = 31;
      break;
    
    
   default:
    days = -1;
    break;
  }
  
  
if(days == -1)
  System.out.println("Invalid month inputed");
else
{
  month = month.toUpperCase().charAt(0) + month.substring(1);
  System.out.println("There are " + days + " days in " + month + ".");
}
 }
}

// The Break stops the execution of commands in a particular case then skips to the end of the Switch.
// Yes