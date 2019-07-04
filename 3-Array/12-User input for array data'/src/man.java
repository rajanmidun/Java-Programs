import java.util.Scanner;
public class man {
public static void main(String args[])
 {
	Scanner rajan= new Scanner(System.in);
	int arr[]= new int[56];
	for(int i=0;i<10;i++)
	{
		arr[i]=rajan.nextInt();
	}
	for(int i=0;i<10;i++)
	{
		System.out.println(arr[i]+"\n");
	}
 }
}
