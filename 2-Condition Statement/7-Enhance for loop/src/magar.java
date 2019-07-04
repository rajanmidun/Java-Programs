
public class magar {
public static void main(String args[])
{
	int arr[]={4,5,6,7};
	int total=0;
	System.out.println("The array data are:");
	for(int x:arr)
	{
		System.out.println(x+" ");
	}
	for(int x: arr)
	{
		total+=x;
	}
	System.out.println("The sum of the given array is "+total);
}
}
