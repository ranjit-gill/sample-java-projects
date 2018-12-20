import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
public class FileCopy {
	public static void main(String[] args) throws Exception {
	    String source = "C:\\docs\\source.txt";
	    String destination = "C:\\docs\\destination.txt";

	    FileInputStream fis = new FileInputStream(source);
	    FileOutputStream fos = new FileOutputStream(destination);

	    FileChannel fci = fis.getChannel();
	    FileChannel fco = fos.getChannel();

	    ByteBuffer buffer = ByteBuffer.allocate(1024);

	    while (true) {
	      int read = fci.read(buffer);

	      if (read == -1)
	        break;
	      buffer.flip();
	      fco.write(buffer);
	      buffer.clear();
	    }
	  }
}
