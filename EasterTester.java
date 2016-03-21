package Assignment_2;

import java.util.Scanner;

public class EasterTester {
	
	public static void main(String[] args)
	{
		int years;
		String answer; 
		//String rMonth;
		
		Scanner in = new Scanner(System.in);
		System.out.println("input the year: ");
		years = in.nextInt();
		
		int a = years % 19;
		int b = years / 100;
		int c = years % 100;
		int d = b / 4;
		int e = b % 4;
		int g = (8 * b + 13)/25;
		int h = (19 * a + b - d - g + 15) % 30;
		int k = c % 4 ;
		int j = c / 4 ;
		int m = (a + 11 * h) / 319;
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		int n =(h - m + r + 90) / 25;
		int p =(h - m + r+ n + 19) % 32;
		String rMonth;
		switch(n)
		{
		case 1:
			rMonth = "January";
			
		case 2:
			rMonth = "February";
			break;
		case 3:
			rMonth = "March";
			break;
		case 4:
			rMonth = "April";
			break;
		case 5:
			rMonth = "May";
			break;
		case 6:
			rMonth = "June";
			break;
		case 7:
			rMonth = "July";
			break;
		case 8:
			rMonth = "August";
			break;
		case 9:
			rMonth = "September";
			break;
		case 10:
			rMonth = "Oktober";
			break;
		case 11:
			rMonth = "November";
			break;
		case 12:
			rMonth = "December";
		default:
			rMonth = "error";
		}
		
		System.out.println("In "+years+", Easter Sunday is: month "+ n + "("+rMonth+") and day = " +p);
		in.close();
	} 

}
