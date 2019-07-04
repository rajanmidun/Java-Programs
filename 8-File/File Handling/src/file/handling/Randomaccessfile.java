package file.handling;

import java.io.*;

public class Randomaccessfile {
 public void randomAcessFile() {
	 RandomAccessFile random=null;
	 try {
		 random= new RandomAccessFile("src.txt","rw");
		 random.seek(0);
		 random.writeUTF("Hello Magar");
		 random.writeInt(45);
		 random.writeDouble(5.44);
		 
		 random.seek(0);
		 System.out.println(random.readUTF());
		 System.out.println(random.readInt());
		 System.out.println(random.readDouble());
		 System.out.println(random.readInt());
		 random.close();
		 
	 }
	 catch(Exception e) {
		 System.out.println(e.getMessage());
	 }
	 
 }
}
