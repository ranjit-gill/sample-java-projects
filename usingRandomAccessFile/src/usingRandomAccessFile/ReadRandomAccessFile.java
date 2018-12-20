package usingRandomAccessFile;
import java.io.RandomAccessFile;

public class ReadRandomAccessFile {
   public static void main(String args[])
   {
	   try {
	   RandomAccessFile raf = new RandomAccessFile("D:\\test\\hello.txt", "r");
	   raf.seek(0);
	   byte[] bytes = new byte[5];
	   raf.read(bytes);
	   raf.close();
	   System.out.println(new String(bytes));
	   }
	   catch(Exception ex)
	   {
		   System.out.println("File Not Found exception");
	   }
   }
}
