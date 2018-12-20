interface int1
{
	void print();
}
interface int2
{
	void print();
}
 class ImplementInt implements int1,int2 {

	public void print()
	{
		System.out.println("implemented print method");
	}
}
 
 public class InheritInterfaces
 {
	 public static void main(String args[])
	 {
		 ImplementInt implementInt = new ImplementInt();
		 
		 implementInt.print();
	 }
 }
 


