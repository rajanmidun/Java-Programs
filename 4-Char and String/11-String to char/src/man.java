
public class man {
public static void main(String atgs[])
{
   String name="Rajan Midun Magar";
   int i;
   char c[]=new char[name.length()];
   for(i=0;i<name.length();i++)
   {
	   c[i]=name.charAt(i);
   }
   i=0;
   System.out.println("String is:\n"+name);
   System.out.println("\nCharacter Array is:");
   System.out.println("Index\tValue");
   for(char m:c)
   {
	   System.out.println(i+"\t"+m);
	   i++;
   }
}
}
