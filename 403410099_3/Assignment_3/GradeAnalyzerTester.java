/*
* [A]100
* [TA's Advise]
* 1. Good!
*/

package Assignment_3;

import javax.swing.JOptionPane;

/** GradeAnalyzeTester program implement 
 * 
 * @author andre.ir
 * @since 2016-04-10
 */
public class GradeAnalyzerTester {
	/*** This is the main method which makes use of analyzing the grade.
	 * @return nothing.
	 * @param args Unused.
	 */
	public static void main (String[] args){
		
		//double TempScore = 0;
		String input;
		GradeAnalyzer GA = new GradeAnalyzer();
		
		do{
			
			input = JOptionPane.showInputDialog("Insert the grade: ");
			//GA.isValidGrade(Double.parseDouble(input));
			if(input.equalsIgnoreCase("q"))
			{
				break;
			}
			GA.addGrade(Double.parseDouble(input));
			
		
		}
		while(true);
		
		if(GA.inputCount >= 2)
		{
			
		
		
		GA.analyzeGrades();
		System.out.println("You entered " +(int)GA.inputCount+ " valid grades from 0 to 110. Invalid grades are ignored!\n");
		//GA.analyzeGrades();
		System.out.println("The average = "+(int)GA.avgTotal+" with a standard deviation = "+(int)GA.SDTemp+"\n");
		System.out.println(GA.toString());
		
		}
		
		else
		{
			System.out.println("You did not enter enough grades to analyze. Please enter at least 2 valid grades");
		}
	}

}
