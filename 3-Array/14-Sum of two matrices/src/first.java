import java.util.Scanner;

public class first {
	public static void display(int a[][],int m,int n)
	{
		 for(int i=0; i<m;i++)
		    {
		    	for(int j=0;j<n;j++)
		    	{
		    		System.out.print(a[i][j]+"\t");
		    	}
		    	System.out.println("");
		    }
	}
	public static void sum(int a[][], int b[][], int m, int n)
	{
		for(int i=0; i<m;i++)
	    {
	    	for(int j=0;j<n;j++)
	    	{
	    		a[i][j]=a[i][j]+b[i][j];
	    	}
	    	
	    }
	}
public static void main(String args[])
{
    Scanner rajan= new Scanner(System.in);
    int a[][]= new int[10][10];
    int b[][]= new int[10][10];
    System.out.println("Enter the no of rows and column ?");
    int m=rajan.nextInt();
    int n=rajan.nextInt();
    System.out.println("Enter the data for first matrix");
    for(int i=0; i<m;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    		a[i][j]=rajan.nextInt();
    	}
    }
    System.out.println("Enter the data for second matrix");
    for(int i=0; i<m;i++)
    {
    	for(int j=0;j<n;j++)
    	{
    		b[i][j]=rajan.nextInt();
    	}
    }
    System.out.println("First matrix");
    display(a,m,n);
    System.out.println("Second matrix");
    display(a,m,n);
    sum(a,b,m,n);
    System.out.println("Matrix after addition is");
    display(a,m,n);
}
}
