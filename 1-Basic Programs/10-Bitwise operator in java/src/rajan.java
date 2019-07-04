
public class rajan {
public static void main(String args[])
{
   int a=15;
   int b=27;
   int and;
   
   //bitwise AND
   and=a&b;
   System.out.println(and);
   
   //Bitwise OR
   and=a|b;
   System.out.println(and);
   
   //Binary XOR
   and=a^b;
   System.out.println(and);
   
   //Binary ones complement
   and=~a;
   System.out.println(and);
   
 //Binary left shift operation
     a=1;
   and=a<<2;
   System.out.println(and);
   
   //Binary right shift operation
   a=4;
   and=a>>2;
   System.out.println(and);
   
   //Binary right shift zero fill operator operation
   a=9;
   and=a >>>2;
   System.out.println(and);
   
}
}
