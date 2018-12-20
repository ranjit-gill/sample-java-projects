import java.util.*;

public class StreamIntegers {
   public static void main(String args[])
   {
	   List<Integer> IntegerList =  new ArrayList<>();
	  
	   IntegerList.add(10);
	   IntegerList.add(20);
	   IntegerList.add(30);
	   IntegerList.add(40);
	   IntegerList.add(50);
	   double average=IntegerList.stream().mapToInt(Integer :: intValue).average().getAsDouble();
	   System.out.println(average);
	   
	  

	 

	  
   }
}
