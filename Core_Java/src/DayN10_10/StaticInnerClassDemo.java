package DayN10_10;

/*** Static Inner class Example  ***/

class Outer1
{
   int n; // instance Field
   static int count; // static Field
   public Outer1() 
   {
	   n=10;
   }
   public void m1()  // Instance Method
   {
	   System.out.println("m1 Mtehod is called...");
   }
   public static void m2()  // static Method
   {
	   System.out.println("m2 Mtehod is called...");
   }
   class Inner
   {
	 int m;
	 public Inner() 
	 {
	    m=20;
	 }
	 //static int cnt; error
	 public void m3()
	 {
	   System.out.println("value of n:"+n);
	   System.out.println("value of count:"+count);
	   System.out.println("m3 Mtehod is called...");
	 }	   
   }//end inner class
}//end outer class
public class StaticInnerClassDemo 
{
 public static void main(String[] args) 
 { 
    Outer1 outobj= new Outer1();
    System.out.println("Value of n:"+outobj.n); //called instance Field
    outobj.m1(); //called instance method
    Outer.m2(); //called static method
    
    Outer1.Inner inobj=outobj. new Inner();
    System.out.println("Value of m:"+inobj.m);
    inobj.m3();//called instance method
 }//end main
}//end class

/*
1.Declaring static member in simple inner class is not allowed.
2.Instance members and Static members of outer class can be used
  within Inner class.
3.Simple Inner class Instance is associated with Outer class Instance.   
4.Inner class object create with the help of outer class object.
  Syntax:
  OuterClasName.InnerClassName InnerClassRef=OuterClassRef. new InnerClassConstructor();
  Example:
  Outer.Inner inobj=outobj. new Inner();
*/
