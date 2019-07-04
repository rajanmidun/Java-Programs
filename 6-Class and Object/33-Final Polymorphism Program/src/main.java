
public class main {
	public static void main(String args[])
	{
animal[] list = new animal[5];

fish f= new fish();
dog d= new dog();
list[0]=f;
list[1]=d;

for(animal x:list)
{
	x.eat();
}
}
}
