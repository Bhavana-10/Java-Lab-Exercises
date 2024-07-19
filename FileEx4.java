package files;
import java.io.*;
public class FileEx4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String dirname = "D://FJWP1";
	      File directory = new File(dirname);

	      // Create directory now.
	      directory.mkdirs();

	      // create new file object
	      File file = new File("D://FJWP1/in.txt");
	      file.createNewFile();

	      System.out.println(file.exists());    
	}

}
