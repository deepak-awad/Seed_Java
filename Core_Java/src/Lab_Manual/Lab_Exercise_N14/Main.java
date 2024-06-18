package Lab_Manual.Lab_Exercise_N14;

/***  ***/

public class Main {
	
   public static void main(String args[])
   {
	   Shape s;
	   
	   s= new Circle(10);
	   s.area();
	   System.out.println(s.toString());	
	   
	   s= new Rectangle(20,30);
	   s.area();
	   System.out.println(s.toString());	   
   }

}
