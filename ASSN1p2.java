////////////////////////////////////////////////////////////////////////////
//
// Tristan Goers
// Assignment 1, PART 2
// DATE September 8, 2016
//
////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//
// DESCRIPTION: Mad Libs
//
// INPUTS: 3 inputs. Someones name, an animal, and a food
//
// OUTPUTS: String that uses the inputs to create a sentence
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 

import javax.swing.JOptionPane;

public class ASSN1p2
{
  public static void main(String[] args)
  {
   String inputName;
   String inputAnimal;
   String inputFood;
   
   inputName = JOptionPane.showInputDialog("Name");
   inputAnimal = JOptionPane.showInputDialog("Animal");
   inputFood = JOptionPane.showInputDialog("Food");
   
   JOptionPane.showMessageDialog( null, inputName + " once said \"my " + inputAnimal + " just ate my homework and it tasted like " + inputFood + ".\" Yuck!");
   System.exit(0);
    
    //System.out.println(--inputName-- + " once said /" my /" + --inputAnimal-- + " just ate my homework and it tasted like " + --inputFood-- + ". Yuck!");
  }
}