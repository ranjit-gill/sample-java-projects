
 class Parent
{
	String name;
	
	Parent()
	{
		name="Parent";
		System.out.println("Invoked parent constructor");
	}
	
	public void Print() {
		System.out.println("From Parent class. Parent class variable is "+name);
	}
	
}
 
 class Child extends Parent
 {
	 String name;
	 Child()
	 {
		 super();// invoking parent constructor
		 name="Child";
		 
		 
	 }
	 public void Print()
	 {
		 System.out.println("From Child class. Child Class variable is "+ name + " Parent Class Variable is "+super.name); //accessing parent variable
		 
		 System.out.println("invoking parent Print()");
		 super.Print(); //invoking parent method
	 }
 }
public class DemonstratingSuper {
     public static void main(String args[])
     {
    	 Child child = new Child();
    	 child.Print();
     }
}

