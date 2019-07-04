package file.handling;

import java.io.*;

public class Filereader {

	public void fileReader() {
		File file= new File("src.txt");
		FileReader readd=null;
		FileWriter write=null;
		try {
		readd= new FileReader(file);
		write=new FileWriter("dest.txt");
		int data;
		while((data=readd.read())!=-1)
		{
			write.write((char)data);
		}
		readd.close();
		write.close();
		
		}
		catch(IOException e) {
			System.out.print(e.getMessage());
		}
		
	}
}
