/*********************
@Author Jesse Allen
@Created 9/2/2013
*********************/

/*This program will allow the input for 3 test scores
 and then display the average of test scores
and the letter grade for the average test score */

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class TestScore
   {
   public static void main(String[] args)
      {
      double scoreOne, //First test score
             scoreTwo, //Second test score
             scoreThree,//Third test score
             averageScore;//average test score
      final int NUM_OF_SCORES = 3; //Number of scores allowed in input
      String input; //variable used in test score parsing

      
       // next three inputs are parsed from string to double
       input = JOptionPane.showInputDialog("Enter test score 1");
       scoreOne = Double.parseDouble(input);
       
       input = JOptionPane.showInputDialog("Enter test score 2");
       scoreTwo = Double.parseDouble(input);

       input = JOptionPane.showInputDialog("Enter test score 3");
       scoreThree = Double.parseDouble(input);
       
       //Decision logic to determine if any test scores are out of range
       if (scoreOne <= 100 && scoreTwo <= 100 && scoreThree <= 100)
         {       
          averageScore = (scoreOne + scoreTwo + scoreThree) / NUM_OF_SCORES;
       
          //Formatted to show average test score to within a tenth 
          DecimalFormat formatter= new DecimalFormat("#0.0");
             
             //Decision logic to determine letter grade 
             if (averageScore < 60)
               {
                  JOptionPane.showMessageDialog(null,"Your average score is " + formatter.format(averageScore)+
                                                     ".\nYour letter grade average is an F");
               }
             else if (averageScore < 70)
               {
                  JOptionPane.showMessageDialog(null,"Your average score is " + formatter.format(averageScore)+
                                                     ".\nYour letter grade average is an D");
               }
             else if (averageScore < 80)
               {
                  JOptionPane.showMessageDialog(null,"Your average score is " + formatter.format(averageScore)+
                                                     ".\nYour letter grade average is an C");
               }
             else if (averageScore < 90)
               {
                  JOptionPane.showMessageDialog(null,"Your average score is " + formatter.format(averageScore)+
                                                     ".\nYour letter grade average is an B");
      
               }
             else if (averageScore <= 100)
               {
                  JOptionPane.showMessageDialog(null,"Your average score is " + formatter.format(averageScore)+
                                                     ".\nYour letter grade average is an A");
                }
          }
       //Message displayed if any test scores are out of range
       else
          JOptionPane.showMessageDialog(null,"Nice Try, How about entering some real scores");
               

      }
}





            
       
      