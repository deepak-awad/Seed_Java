package Lab_Manual.Lab_Exercise_N14;

public class Circle extends Shape {
	
	int r;
	float area;
	

	public Circle(int r) {
		super();
		this.r = r;
	}

	public Circle() {
		super();
	}
	
	@Override
	public void area() {
		area = PI* r *r;
	}
	
	@Override
	public String toString() {
		return "Area of circle is: "+area;
	}
	

}
