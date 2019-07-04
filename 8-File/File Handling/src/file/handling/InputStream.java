package file.handling;

import java.io.*;
public class InputStream {

	public void readData() {
		FileInputStream in=null;
		FileOutputStream out=null;
		try {
			in = new FileInputStream("src.txt");
			out = new FileOutputStream("dest.txt"); 
			int c;
			while ((c = in.read()) != -1) 
			{  
				out.write(c); 
			}
			in.close();
			out.close();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
