import java.util.Scanner;

import javax.sound.midi.Synthesizer;
public class kaka {
public static void main(String ar[])
{
	Scanner rajan=new Scanner(System.in);
	System.out.println("Enter yout age??");
	int age=rajan.nextInt();
	if(age>18)
	{
		System.out.println("You are ready for voting");
	}
	else
		System.out.println("You are not ready for voting");
}
}
