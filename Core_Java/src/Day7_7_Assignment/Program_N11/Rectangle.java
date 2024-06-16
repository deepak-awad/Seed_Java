package Day7_7_Assignment.Program_N11;

/*** Program on Rectangle  ***/

public class Rectangle
{
    int length;
    int width;
    
    public Rectangle()
    {
    	length=0;
    	width=0;
    }

	public Rectangle(int length, int width) 
	{
		this.length = length;
		this.width = width;
	}

	public int CalArea()
	{
		int area=0;
		area = length * width ;
	    return area;
	}
	
	public void display()
	{
		System.out.println("Area Of Rectangle is: " +CalArea());
		
	}

	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle(90, 50);
		r.display();

	}

}