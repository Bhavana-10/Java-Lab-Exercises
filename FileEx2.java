package files;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class FileEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*FileOutputStream fout=null;
		BufferedOutputStream bout=null;
		try
		{
		 fout=new FileOutputStream("E://FJWP/files/testout.txt");    
	     bout=new BufferedOutputStream(fout);    
	     String s="Hi, How are You?";    
	     byte b[]=s.getBytes();    
	     bout.write(b);    
	     bout.flush();     
	     System.out.println("success");  
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			try {
				bout.close();
				fout.close(); 
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}    
		     
		}*/
		try(FileOutputStream fout=new FileOutputStream("D://FJWP/files/test.txt");
			BufferedOutputStream bout = new BufferedOutputStream(fout))
		{
			 String s="Hi, How are You?, welcome to Anudip";    
		     byte b[]=s.getBytes();    
		     bout.write(b);    
		     bout.flush();     
		     System.out.println("success"); 
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

}
