package Project.Project1;
import java.util.*;
import java.lang.Comparable;

/*** 1) Create product class with 5 attributes id, name, quantity, price, GST
 *   2) Store 10 products in the ArrayList take all the information form user by using scanner interface.
 *   3) Sort product by using their price and name 
 *   4) Inside MainClass. Create one Menu driven form
 *       a) Add product
 *       b) Display Product (Sorted by price)
 *       c) Update product info
 *       d) Delete product
 *       e) create Bill (Calculated price) ***/ 

class Product {
	
	private int id;
	private String name;
	private int quantity;
	private int price;
	static private float gst;
	float gstprice,totalprice;
	float total;
	
	static 
	{
		gst =3.2f;
	}
	public Product()
	{
	}
	public Product(int id, String name, int quantity, int price)
	{
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setPrice(int price)
	{
		this.price = price;
	}
	public int getPrice()
	{
		return price;
	}
	public String toString()
	{
		return "Product id is: "+id+"\nProduct name is: "+name+"\nProduct quntity is: "+quantity+"\nProduct price(per qunatity): "+price;
	}
	public void display()
	{
		System.out.println("Product id is: "+id);
		System.out.println("Product name is: "+name);
		System.out.println("Product qunatity is: "+quantity);
		System.out.println("Product price(per quantity): "+price);
		System.out.println("GST is:"+gst);
		System.out.println("---------------------------------------");
	}
	public void calculate()
	{
		total = quantity * price;
		gstprice = (total * gst)/ 100;
		totalprice = total +gstprice;
	}
	public void printBill()
	{
		System.out.println("---------------------------------------");
		System.out.println("Product id is:                 "+id);
		System.out.println("Product name is:               "+name);
		System.out.println("Product qunatity is:           "+quantity);
		System.out.println("Product price(per quantity):   "+price);
		calculate();
		System.out.println("---------------------------------------");
		System.out.println("Total:                         "+total);
		System.out.println("Gst "+gst+"%"+" is:                 "+gstprice);
		System.out.println("---------------------------------------");
		System.out.println("Total price:                  "+totalprice);
		
	}
	
	

}
public class MainClass {
	
	public static void main(String args[])
	{
		int choice =0;
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Product> list = new ArrayList<>();
		
		
		do {
			System.out.println("***** Product Class *****");
			System.out.println("1) Add Products "
					+ "\n2) Display All Product "
					+ "\n3) Display Product (Sorted by price)"
					+ "\n4) Update Product Info"
					+ "\n5) Delete Product"
					+ "\n6) Create Bill"
					+ "\n7) Display Product (Sorted by Name)");
			System.out.println("Enter your choice:");
			choice =sc.nextInt();
			
			switch(choice)
			{
			case 1:
				System.out.println("*** Add Product ***");
				System.out.println("Enter number of product to be add: ");
				int num =sc.nextInt();
				
				for( int i =0; i<num ; i++)
				{
					System.out.println("Product id is: ");
					int eid = sc.nextInt();
					System.out.println("\nProduct name is: ");
					String name =sc.next();
					System.out.println("Product qunatity is: ");
					int quantity = sc.nextInt();
					System.out.println("Product price(per quantity): ");
					int price = sc.nextInt();
					
					list.add(new Product(eid, name, quantity, price));
				}
				break;
				
				
			case 2:
				System.out.println("*** Add Product ***");
				Iterator itr = list.iterator();
				while(itr.hasNext())
				{
					System.out.println(itr.next());
				}
			    break;
			    
			case 3:
				System.out.println("*** Display product (Sorted by price) ***");
				Collections.sort(list, new PriceCompare());
				Iterator<Product> itr1 = list.iterator();
				while(itr1.hasNext())
				{
					System.out.println(itr1.next());
				}
				break;
				
			case 4:
				System.out.println("*** Update Product INFO ***");
				System.out.println("Enter the product id: ");
				int userid = sc.nextInt();
				
				for(int i =0; i<list.size();i++)
				{
					Product product = list.get(i);
					
					if(product.getId() == userid)
					{
						System.out.println("Id is found: "+userid);
						System.out.println("what to update: (name, quantity, price):");
						String check = sc.next();
						
						if(check.equals("name") || check.equals("Name"))
						{
							System.out.println("Product name is: ");
							String name = sc.next();
							product.setName(name);
						}else if(check.equals("quantity") || check.equals("Qunatity"))
						{
							System.out.println("Product qunatity is: ");
							int quantity = sc.nextInt();
							product.setQuantity(quantity);
						}else if(check.equals("price") || check.equals("Price"))
						{
							System.out.println("Product price(per quantity): ");
							int price = sc.nextInt();
							product.setPrice(price);
						}else
						{
							System.out.println("Invalid Enter Details");
						}
						
						System.out.println("Update Successfully...");
						System.out.println("----------------------------------");
						product.display();
						
					}else
					{
						System.out.println("Id is not found");
					}
				}
				break;
				
			case 5:
				System.out.println("*** Update Product ***");
				System.out.println("Enter product id: ");
				int id = sc.nextInt();
				
				Iterator itr2 = list.iterator();
				while(itr2.hasNext())
				{
					Product product = (Product) itr2.next();
					if(product.getId() == id)
					{
						itr2.remove();
						System.out.println("Product removed Successfully");
					}else
					{
						System.out.println("product not removed");
					}
				}
				break;
				
			case 6:
				System.out.println("*** Create Bill ***");
				System.out.println("Enter product id: ");
				int proid = sc.nextInt();
				
				Iterator itr3 = list.iterator();
				while(itr3.hasNext())
				{
					Product product =(Product) itr3.next();
					if(product.getId() == proid)
					{
						System.out.println("Product Found Successfully");
						product.printBill();
						
					}else
					{
						System.out.println("Produt no found");
					}
					
				}
				break;
				
			case 7:
				System.out.println("*** Display Product (Sorted by Name) ***");
				
				Collections.sort(list, new NameComparable());
				Iterator itr4  = list.iterator();
				while(itr4.hasNext())
				{
					Product product =(Product)itr4.next();
					product.display();
					
				}
				break;
				
				default:
					System.out.println("Invalid Choice...");
			}		
		}while(choice != 0);
		
	}
}
