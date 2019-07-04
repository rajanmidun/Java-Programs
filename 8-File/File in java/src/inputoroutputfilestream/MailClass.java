package inputoroutputfilestream;

import java.io.*;


public class MailClass {
	public static void main(String arg[]) {
		FileInputStream in = null;
		FileOutputStream out = null;
		try
		{
			in = new FileInputStream("src.txt");
			out=new FileOutputStream("dest.txt");
			int c;
			while((c=in.read())!=-1)
				out.write(c);
		}
		catch(
		Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			try {
				in.close();
				out.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
       System.out.println("Successfull!!!!");
	}
}
