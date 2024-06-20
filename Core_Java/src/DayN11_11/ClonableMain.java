package DayN11_11;

/*** Clone concept main ***/
public class ClonableMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Clonable d = new Clonable();
		System.out.println(d.toString());
		
		Clonable d2 = d; //shallow cloning
		System.out.println(d2.toString());
		
		System.out.println("d1:"+d);
		   System.out.println("d1 HashCode:"+d.hashCode());
		   System.out.println("d2:"+d2);
		   System.out.println("d2 HashCode:"+d.hashCode());
		   
		   Clonable d3 =(Clonable) d.clone(); // deep cloning
		   System.out.println("d3:"+d3);
		   System.out.println("d3 HashCode:"+d3.hashCode());

	}

}
