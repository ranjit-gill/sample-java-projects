

enum Day
	{
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY 
	}

	
	public class DemonstrateEnum
	{

	  public static void main(String[] args)
	  {
	    
	    for (Day d: Day.values())
	    {
	    	 switch (d)
	 	    {
	 	      case MONDAY:
	 	      case TUESDAY:
	 	      case WEDNESDAY:
	 	      case THURSDAY:  

	 	      case FRIDAY:    System.out.println("weekday... ");
	 	                      break;

	 	      case SATURDAY:
	 	      case SUNDAY:    System.out.println("weekend ...");
	 	                      break;

	 	      default:        System.out.println("What day is it?");;
	 	    }
	    }
	  }

	
	 
	}

	
