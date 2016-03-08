class Rectangle {
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
		
			

	public class RectangleTester {
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Rectangle rectangle1 = new Rectangle(5,2,2,2);
			Rectangle rectangle2 = new Rectangle(3,30,0,0);
			
			//rectangle1.setArea(47,60,12,0);
			System.out.println(rectangle1.toString());
			System.out.println(rectangle2.toString());
			//System.out.println("Area = "+rectangle1.getArea());
			//System.out.println("Perimeter = "+rectangle1.getPerimeter());
			
		}
		
	}
