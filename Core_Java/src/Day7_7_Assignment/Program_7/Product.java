package Day7_7_Assignment.Program_7;

/*** Define a class called Product with following specifications:
Private members are:
product code           String (should start with P followed by integer value – P101, P102, etc.). It should be automatically generated
name                          String
 Public members are:
Getter and setter methods, parameterized constructor with one parameter and overridden toString()        ***/

public class Product {
	private String product_code;
	private String name;
	private static int count =101;
	
	public void getName(String name)
	{
		product_code="P"+ count++;
		this.name = name;
	}
	public void setName()
	{
		System.out.println("Product ID:"+product_code+"\nProduct Name:"+name);
	}
	public Product(String name)
	{
		product_code="P"+ count++;
		this.name = name;
	}
	public String toString()
	{
		return "Product ID:"+product_code+"\nProduct Name:"+name;
	}
	
	public static void main(String[] args) {
		Product p1 = new Product("Tablet");
		p1.setName();
		System.out.println(p1.toString());
		
		System.out.println();
		
		Product p2 = new Product("Redmi");
		p2.setName();
		System.out.println(p2.toString());
	}

}
