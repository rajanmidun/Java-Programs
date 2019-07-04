import java.io.File;
import java.nio.file.*;
public class checkwheatherthefileexist {
public static void main(String args[])
{
  File nam =new File("E:\\3-Java\\Java File Handling\\src\\rajan.txt");	
  if(nam.exists())
	  System.out.println(nam.getName()+" exist");
  else
	  System.out.println("File doesnot  exist");
  
}
}
