import java.util.Random;
public class rand {
public static void main(String args[])
		{
	//occurance of each faces in a dice
	      Random ran= new Random();
	      int num;
	      int a=0,b=0,c=0,d=0,e=0,f=0;
	      for(int i=0;i<45;i++)
	      {
	    	 
	    	  num=1+ran.nextInt(6);
	    	  if(num==1)
	    		  a++;
	    	  else if(num==2)
	    		  b++;
	    	  else if(num==3)
	    		  c++;
	    	  else if(num==4)
	    		  d++;
	    	  else if(num==5)
	    		  e++;
	    	   else
	    	  f++;
	      }
	      System.out.println("Face\tOccurance Time");
	      System.out.println("1\t"+a);
	      System.out.println("2\t"+b);
	      System.out.println("3\t"+c);
	      System.out.println("4\t"+d);
	      System.out.println("5\t"+e);
	      System.out.println("6\t"+f);
	      
		}
}
