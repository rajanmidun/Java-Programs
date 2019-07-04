import java.util.Scanner;
public class first {
public static void main(String arfs[])
{
    Scanner rajan= new Scanner(System.in);
    int m,n;
    int a[][]= new int[10][10];
    int b[][]= new int[10][10];
    System.out.println("Enter the no of rows and column of the matrix?");
    m= rajan.nextInt();
    n= rajan.nextInt();
    System.out.println("Enter the value of the matrix??");
    for(int i =0;i<m;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    		a[i][j]=rajan.nextInt();
    	}
    }
    System.out.println("You emtered!!1");
    display(a,m,n);
    System.out.println("The necessary matrix is");
    for(int i=0;i<m;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    	   b[i][j]=a[j][i];
    	}
    }
    display(b,m,n);
}
public static void display(int x[][],int m,int n)
{
	 for(int i=0;i<m;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    	   System.out.print(x[i][j]+"\t");
	    	}
	    	System.out.println();
	    } 	
}
}
