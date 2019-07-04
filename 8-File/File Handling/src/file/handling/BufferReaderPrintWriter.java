package file.handling;

import java.io.*;

public class BufferReaderPrintWriter {
	public static void main(String args[]) {
		BufferedReader in = null;
		PrintWriter out = null;
		try {
			in = new BufferedReader(new FileReader("src.txt"));
			out=new PrintWriter(new FileWriter("dest.txt"));
			String text=null;
			while((text=in.readLine())!=null)
				out.write(text);
			
			in.close();
			out.close();
		} 
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
