package Assignment_3;

import java.util.ArrayList;

import javax.swing.JOptionPane;
	/**
	 * 
	
class MyCount {
		String mark;
		int cnt = 0;

		//MyCount(){}
	
		MyCount(String _name, int _cnt) {
			
			this.mark = _name;
			this.cnt = _cnt;
			
		}
		public String toString(){
	 
			return this.mark + " = " +this.cnt;
		}
	
	}	*/
	
	public class GradeAnalyzer
	{
		/**
		 * 
		 * An object of this class accepts any number of grades,determines whether they are valid, then calculates their average, standard deviation, and grade
		 * distribution (i.e., number of grades in each letter grade category). Finally, it presents the results
		 * for all valid grades entered.
		 * 
		 */
		final int MAX = 100;
		public double inputCount, avgTotal, SDTemp ;
		public boolean next;
		public int gradeAP,gradeA,gradeAM,gradeBP,gradeB,gradeBM,gradeCP,gradeC,gradeCM,gradeDP,gradeD,gradeDM,gradeF;
		ArrayList<Double> cGrade = new ArrayList<Double>();
		//MyCount[] GradeList = new MyCount[12];
		//double[] gradeArray = new double[5];
		/**
		 * 
		 * @param grade The parameter is used to isValidGrade method
		 * @return next : boolean this return whether is true or not
		 */
		public boolean isValidGrade(double grade)
		{
			if(grade>=0 && grade<=110)
				{ System.out.println("valid");
				inputCount++;
				next = true;}
			else
			{	//System.out.println("not valid");
				next = false;
				//JOptionPane.showMessageDialog(null, "Wrong input, you have to input 0 to 110");
			}
				return next;
		}
		
		/**Description of the method addGrade(double grade)
		 * First of all the grade variable will thrown to this method
		 * @param grade The parameter to addGrade
		 * @return nothing
		 */
		void addGrade(double grade)
		{
			//cGrade.add(88.00);
			//cGrade.add(50.00);
			//cGrade.add(grade);
			/**
			for(int i = 0; i < cGrade.size(); i++)
			 
			{
				double value = cGrade.get(i);
				System.out.println("array "+i+" "+value);
				
			}
			
			//System.out.println("array is "+ cGrade);
			*/
			boolean nnext = isValidGrade(grade);
			if(nnext == true)
			{
				
				cGrade.add(grade);
				double totalGrade = 0;
				for(double value : cGrade)
				{
					totalGrade += value;
					System.out.println("Score " +value);
					System.out.println("Total score : "+totalGrade);
				}
				avgTotal = totalGrade / inputCount;
				System.out.println("Average : "+avgTotal);
				
			if(grade >= 98)
			{
				gradeAP++;
			}
			
			else if(grade < 98 && grade >=92)
			{
				gradeA++;
			}
			
			else if(grade < 92 && grade >=90)
			{
				gradeAM++;
			}
			else if(grade < 98 && grade >=88)
			{
				gradeBP++;
			}
			else if(grade < 98 && grade >=82)
			{
				gradeB++;
			}
			else if(grade < 98 && grade >=80)
			{
				gradeBM++;
			}
			else if(grade < 98 && grade >=78)
			{
				gradeCP++;
			}
			else if(grade < 98 && grade >=72)
			{
				gradeC++;
			}
			else if(grade < 72 && grade >=70)
			{
				gradeCM++;
			}
			else if(grade < 70 && grade >=60)
			{
				gradeD++;
			}
			else if(grade < 60)
			{
				gradeF++;
			}
			else{
				JOptionPane.showMessageDialog(null, "Wrong input, you have to input 0 to 110");
				
			}
		}
	}
	
	/** This method analyze the grades standard deviation 
	 * @return nothing
	 * @param unused
	 */
		void analyzeGrades()
		{
			double SD=0 ,s ;
			for(int i=0; i < cGrade.size();i++)
			{
				SD += (cGrade.get(i)-avgTotal) * (cGrade.get(i)-avgTotal);
				
			}
			s = SD / (inputCount-1);
			SDTemp = Math.sqrt(s);
		}
		/**This method call the string
		 * @param unused
		 * @return str
		 */
		public String toString()
		{
			String str ="The grade distirbution is\nA+ = "+gradeAP+"\nA = "+gradeA+"\nA- = "+gradeAM+"\nB+ = "+gradeBP+"\nB = "+gradeB+"\nB- = "+gradeBM+"\nC+ = "+gradeCP+"\nC = "+gradeC+"\nC- = "+gradeCM+"\nD = "+gradeD+"\nF = "+gradeF+"\n";
			return str;
		}
}
	
				

