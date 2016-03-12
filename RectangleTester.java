
/*
 * [A]100
 * [TA's advise]
 * 1.Please use the properties according to the question.
 * 2.Can width, height, x-axis, y-axis be float? if let user input the properties, instead of your setting, you program could be crash or wrong calculate, right?
 * 3.Do-While loop is good idea! Extra bonus +2.
 * 4.You may insert the try-catch to slove the exception, it could be better. 
 * 5.Is there any idea for the Do-While loop's if statement better? if I insert not "Y/y" or "N/n", how will the program run?
 * 6.You didn't use the getWidth() and getHeight() to calculate the area and perimeter, -2.
 * */

import java.util.Scanner;

public class RectangleTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Rectangle rectangle1 = new Rectangle(5,9,2,2);
		// Rectangle rectangle2 = new Rectangle(3,30,0,0);

		int iWidth, iHeight, iX, iY;
		String answer;
		char repeat;
		Scanner input = new Scanner(System.in);
		/*
		 * Here is according to the assignment
		 */
		Rectangle rectangle1 = new Rectangle();
		rectangle1.setRectangle(2, 2, 2, 2);
		Rectangle rectangle2 = new Rectangle();
		rectangle2.setRectangle(10, 2, 10, 27);
		System.out.println(rectangle1.toString());
		System.out.println(rectangle2.toString());
		System.out.println("End of Output!\n");
		// on loop condition
		do {
			Rectangle square = new Rectangle();
			System.out.println("Enter the width you wanted : ");
			iWidth = input.nextInt();
			System.out.println("Enter the width you wanted : ");
			iHeight = input.nextInt();
			iX = 0;
			iY = 0;
			square.setRectangle(iHeight, iWidth, iX, iY);
			System.out.println(square.toString());
			System.out.print("End of Output!");
			System.out.println("Would you like to calculate another?");
			System.out.println("Enter Y for yes or N for no:");
			answer = input.next();
			repeat = answer.charAt(0);
		} while (repeat == 'Y' || repeat == 'y');
		// rectangle1.setArea(47,60,12,0);
		// System.out.println(rectangle1.toString());
		// System.out.println(rectangle2.toString());
		// System.out.println("Area = "+rectangle1.getArea());
		// System.out.println("Perimeter = "+rectangle1.getPerimeter());
		input.close();
	}

}

class Rectangle {
	public int width;
	public int height;
	public double axesX;
	public double axesY;

	public void setRectangle(int h, int w, int x, int y) {
		height = h;
		width = w;
		axesX = x;
		axesY = y;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public int getArea() {
		return (height * width);
	}

	public int getPerimeter() {
		return 2 * (height + width);
	}

	public String toString() {
		String str = "java.rectangle[x=" + axesX + ",y=" + axesY + ",width=" + width + "" + ",height=" + height
				+ "]\nArea=" + getArea() + "\nPerimeter=" + getPerimeter() + "";

		return str;
	}

}
