package Assignment;

public class Rectangle {
	public int width;
	public int height;
	public double axesX;
	public double axesY;
	
	public Rectangle(int h, int w, int x, int y)
	{
		height = h;
		width = w;
		axesX = x;
		axesY = y;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public int getWidth()
	{
		return width;
	}
	
	public int getArea()
	{
		return (height * width);
	}
	
	public int getPerimeter()
	{
		return 2 * (height + width);
	}
	
	public String toString()
	{
		String str = "java.rectangle[x=" +axesX+ ",y=" +axesY+ ",width=" +width+ ""
				+ ",height=" +height+ "]\nArea=" +getArea()+ "\nPerimeter=" +getPerimeter()+ "\n";
		
		return str;
	}
}


