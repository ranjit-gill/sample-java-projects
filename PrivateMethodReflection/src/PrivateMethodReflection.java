

import java.lang.reflect.Method;



public class PrivateMethodReflection {

	public static void main (String args[]) 
	{
		
		try {
		@SuppressWarnings("unchecked")
		Class<Person> person = (Class<Person>) Class.forName("Person");
			
		Person privateRyan = new Person("John" , "12345689");
		
        Method privateMethod = person.getDeclaredMethod("call");
      
       
        privateMethod.setAccessible(true);
      
        
        privateMethod.invoke(privateRyan);
		}
		catch(Exception ex)
		{
			System.out.println("Exception is "+ex.getMessage());
		}


	}
}

class Person{
    public String name;
    private String phone;
    
    public Person(String name, String phone){
        this.name = name;
        this.phone = phone;
    }
  
    private void call(){
        System.out.println("Calling " + this.name +" at " + this.phone);
    }
  
    public String getName(){
        return name;
    }
}



