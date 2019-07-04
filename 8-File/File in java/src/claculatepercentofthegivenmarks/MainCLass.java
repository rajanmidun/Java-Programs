package claculatepercentofthegivenmarks;

import java.io.*;
import java.util.*;
public class MainCLass {
public static void main(String args[])
{
	try{
    Scanner scanner= new Scanner(new File("marks.txt"));	
    System.out.println("ID\tMath\tEnglish\tSocial\tNepali\tScience\tPercentage");
    for(int i=0;i<4;i++) {
    	int id=scanner.nextInt();
    	double math=scanner.nextDouble();
    	double english=scanner.nextDouble();
    	double social=scanner.nextDouble();
    	double nepali=scanner.nextDouble();
    	double science=scanner.nextDouble();
    	double percentage=(math+english+social+nepali+science)/5.0;
    	System.out.println(id+
    			           "\t"+math+
    			           "\t"+english+
    			           "\t"+social+
    			           "\t"+nepali+
    			           "\t"+science+
    			           "\t"+percentage+"%");
    }
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	
}
}
