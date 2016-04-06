/*
 * [B]82
 * [TA's Advise]
 * 1.使用JOptionPane是個有趣的表現, extra point +2.
 * 2.請繳交整個project.
 * 3.沒有看到你的javadoc -5
 * 4.實作的演算法錯誤(題目要求為Gauss, 此演算法為Anonymous Gregorian, 等級從B開始計算.
 * 5.常見的數學method可以記一下: Math.floor(), Math.abs(), Math.round(), Math.sqrt(), and so on..
 * 6.這種寫法很容易出錯喔! 小心!
 * */

package 403410099_2;

import javax.swing.JOptionPane;

public class EasterTester {

	public static void main(String[] args) {
		// int year;
		// String rMonth;
		// Easter easter1 = new Easter();
		/**
		 * Here it is the program to find the EasterDay in different year
		 */
		Easter easter1, easter2, easter3, easter4;
		easter1 = new Easter();
		easter2 = new Easter();
		easter3 = new Easter();
		easter4 = new Easter();
		// First object on year of 2000
		easter1.setEaster(2000);
		// Second object on year of 2001
		easter2.setEaster(2001);
		// Third object for year of 2012
		easter3.setEaster(2012);
		// Show the result by a dialog info box
		JOptionPane.showMessageDialog(null, "Test 1 : " + easter1.toString() + " \nTest 2 : " + easter2.toString()
				+ "\nTest 3 : " + easter3.toString());
		String input = JOptionPane
				.showInputDialog("You have one chance time to test the year that you want to compute the"
						+ "easter day\nEx : 2001,2002,2003,2004...... (no wrong input)");
		int inputImitate = Integer.parseInt(input);
		easter4.setEaster(inputImitate);
		JOptionPane.showMessageDialog(null, easter4.toString());

		/*
		 * //First object on year of 2000 easter1.setEaster(2000);
		 * System.out.println(easter1.toString()); easter2.setEaster(2001);
		 * //Second object on year of 2001
		 * System.out.println(easter2.toString()); //Third object for year of
		 * 2012 easter3.setEaster(2012); System.out.println(easter3.toString());
		 * Scanner in = new Scanner(System.in); System.out.println(
		 * "input the year: "); int year = in.nextInt(); in.close();
		 */

	}

}
