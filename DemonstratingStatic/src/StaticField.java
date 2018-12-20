
public class StaticField {
	int a =10;
	static int b=0;
	
	public void Print()
	{
		b++;
		a++;
		//Expected output :
		 //value of a 11 value of b 1
		 //value of a 11 value of b 2
		// value of a 11 value of b 3
		System.out.println(" value of a " + a + " value of b " +b );
	}
   public static void main(String args[])
   {
	   StaticField sf1 = new StaticField();
	   StaticField sf2 = new StaticField();
	   StaticField sf3 = new StaticField();
	   sf1.Print();
	   sf2.Print();
	   sf3.Print();
	   
   }
}
