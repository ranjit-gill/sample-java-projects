
public class ExceptionChaining {
	
	public static void main(String args[])
	{
		try {
		f();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		
	}
	
	public static void f() throws Exception
	{
		try {
		g();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			throw new Exception("Exception in method f()");
		}
	}
	
	public static void g() throws Exception
	{
		
			throw new Exception("Exception in method g()");
		
		
	}

}
