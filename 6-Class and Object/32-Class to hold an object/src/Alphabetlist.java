
public class Alphabetlist {
private appball[] list = new appball[5];
private int count;

public void display(appball a)
{
     if(count<list.length)
     list[count]=a;
     System.out.println("Alphabet added to the index "+count);
     count++;
}
}
