
public class InitializeVariables {
	
	int a;
	String s;
	
	public InitializeVariables()
	{
		a=10;
		s="self learning";
	}
	
	public InitializeVariables(int x, String str)
	{
		this.a=x;
		this.s=str;
	}
      public static void main(String args[])
      {
    	  InitializeVariables initVar1 = new InitializeVariables();
    	  InitializeVariables initVar2 = new InitializeVariables(20,"training");
    	  System.out.println("Varible values for object initVar1 are " + initVar1.a + " and "+initVar1.s);
    	  System.out.println("Varible values for object initVar1 are " + initVar2.a + " and "+initVar2.s);
    			  
    	  
      }
}
