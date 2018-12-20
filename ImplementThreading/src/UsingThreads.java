
public class UsingThreads {

		   public static void main(String as[]){
		      Mythread th1=new Mythread();
		     
		      Thread th2=new Thread(new OtherThread(),"My Thread");
		      th1.start();
			    th2.start();
		   
		        
		     
		      
		   }
		}
		class Mythread extends Thread{
		    public void run(){
		         
		        Thread th=Thread.currentThread();
		        for(int i=1;i<=10;i++){
		            System.out.println(th.getName()+"+Value is"+i);
		            try{
		                Thread.sleep(500);
		            }catch(Exception e){
		                e.printStackTrace();
		            }
		        }
		             
		    }
		
}
		
		 class OtherThread implements Runnable
		{
		  public void run()
		  {
			  Thread th=Thread.currentThread();
		       for(int i=1;i<=10;i++)
		       {
		        System.out.println(th.getName()+"+Value is"+i);
		        try
		        {
		          Thread.sleep(500);
		        }
		        catch(InterruptedException e)
		        {
		          System.out.println(e);
		        }
		    }
		   }
		}
		    
		   