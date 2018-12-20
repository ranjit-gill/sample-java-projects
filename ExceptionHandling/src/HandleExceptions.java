
public class HandleExceptions {
	
	public static void main(String args[])
	{
		try
		{
			int a=0;
			int b=0;
			int[] arr = new int[5];
			for(int i=0;i<=arr.length;i++)
			{
				arr[i]=i;
			}
			
		}
		catch(ArithmeticException ex)
		{
			System.out.println("Arithmetic Exception encountered");
		}
		catch(IndexOutOfBoundsException ex)
		{
			System.out.println("Index out of bound Exception encountered");
		}
	}

}
