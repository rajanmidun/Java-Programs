
public class first {
public static void main(String args[]){
	int rajan[]={4,5,6,7,8};
	rajan1(rajan);
	for(int y: rajan){
		System.out.println(y);
	}
}
public static void rajan1(int a[]){
   for(int i=0;i<a.length;i++)
   {
	   a[i]+=5;
   }
}
}
