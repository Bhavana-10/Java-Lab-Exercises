package files;
import java.io.FileInputStream;
import java.io.FileOutputStream;
//import java.io.IOException;
public class FileEx1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try
		{
			fis = new FileInputStream("D://FJWP/files/input.txt");
			int data = fis.read(); // Read a single byte
			fos = new FileOutputStream("D://FJWP/files/output.txt");
			while (data!=-1) {
				fos.write(data); // Write a single byte
				data=fis.read();
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			try
			{
				fos.close();
				fis.close();
			}
			catch(Exception e)
			{
				System.out.println(e.getLocalizedMessage());
			}
			
		}
		System.out.println("File copied successfully");

	}

}
