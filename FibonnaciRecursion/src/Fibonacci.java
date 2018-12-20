
public class Fibonacci {

	public static void main(String args[])
	{
		int n=10;
		
		Fibonacci_recur(0,1,1,n);
	}
	
	public static void Fibonacci_recur(int a,int b,int counter, int len)
	{
		if(counter<=len)
		{
			System.out.println(a);
			Fibonacci_recur(b,a+b,counter+1,len);
		}
	}
}
