import java.util.Scanner;

public class fitst {
public static void main(String args[]){
	
	int i,j;
	Scanner rajan = new Scanner(System.in);
	int m,n;	
    System.out.println("Please enter how many rows and columns for both matrix!!");
	m= rajan.nextInt();
	n= rajan.nextInt();
	int a[][]= new int[m][n];
	int b[][]= new int[m][n];
	int c[][]= new int[m][n];
	System.out.println("Enter the first matrix??");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
		     a[i][j]= rajan.nextInt();		
		}
	}
	
	System.out.println("Enter the Second matrix??");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
		     b[i][j]= rajan.nextInt();		
		}
	}
	System.out.println("Multiplication of the matrix!!");
	for(i=0;i<m;i++)
	{
		for(j=0;j<n;j++)
		{
			int sum=0;
			for(int k=0;k<n;k++)
			{
			   sum+=a[i][k]*b[k][j];	
			}
			c[i][j]=sum;
		}
	}
	System.out.println("First matrix is");
	display(a,m,n);
	System.out.println("Second matrix is");
	display(b,m,n);
	System.out.println("Final matrix is");
	display(c,m,n);
}
public static void display(int x[][],int m, int n)
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
