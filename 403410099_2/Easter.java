package 403410099_2;

class Easter {
	/**
	 * Easter class is the another method that count the day.
	 */
	private int n, p, years;
	private String rMonth;

	public int setEaster(int yrs) {
		// let 'years' be the year here
		years = yrs;
		// Divide Y by 19 to get a remainder as A
		int a = years % 19;
		// Divide Y by 100 to get a quotient B and a remainder C
		int b = years / 100;// Math.floor(), -2
		// Divide Y by 100 to get a remainder C
		int c = years % 100;
		// Divide B by 4 to get a quotient D
		int d = b / 4;
		// Divide B by 4 to get a remainder E
		int e = b % 4;
		// Divide (8*B+13) by 25 to get a quotient G
		int g = (8 * b + 13) / 25;
		// Divide (19*A+B-D-G+15) by 30 to get a remainder H
		int h = (19 * a + b - d - g + 15) % 30;
		// Divide C by 4 to get a quotient J
		int k = c % 4;
		// Divide C by 4 to get a remainder K
		int j = c / 4;
		// Divide (A+11*H) by 319 to get a quotient M
		int m = (a + 11 * h) / 319;
		// Divide (2*E+2*J-K-H+M+32) by 7 to get a remainder R
		int r = (2 * e + 2 * j - k - h + m + 32) % 7;
		// Divide (H-M+R+90) by 25 to get a quotient N
		n = (h - m + r + 90) / 25;
		// Divide (H-M+R+N+19) by 32 to get a remainder P
		// 32?
		p = (h - m + r + n + 19) % 32;

		return n;
	}

	public String setMonth() {
		// This constructor switch the month from number to variable
		switch (n) {
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
			// October
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

		return rMonth;
	}

	public String getMonth() {
		return setMonth();
	}

	public int getDay() {
		return n;
	}

	// A constructor to printout the result
	public String toString() {
		return "In " + years + ", Easter Sunday is: month " + n + "(" + getMonth() + ") and day = " + p;
	}
}
