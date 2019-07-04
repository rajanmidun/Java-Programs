import java.util.EnumSet;

public class first {
public static void main(String args[]){
	for(color red: color.values())
	{
		System.out.printf("%s\t%s\t%d",red,red.getname(),red.getid());
		System.out.println();
	}
	System.out.println("\nRange\n");
	for(color reda: EnumSet.range(color.rajan, color.mama))
	{
		System.out.printf("%s\t%s\t%d",reda,reda.getname(),reda.getid());
		System.out.println();
	}
		
}
}
