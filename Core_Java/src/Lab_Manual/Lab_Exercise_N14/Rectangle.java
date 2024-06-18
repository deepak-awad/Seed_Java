package Lab_Manual.Lab_Exercise_N14;

public class Rectangle extends Shape {
	
	int l;
	int b;
	int area;
	
	public Rectangle() {
		super();
	}

	public Rectangle(int l, int b) {
		super();
		this.l = l;
		this.b = b;
	}

	
	@Override
	public void area() {
		area = l * b;
	}

	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", b=" + b + ", area=" + area + "]";
	}
	
	

}
