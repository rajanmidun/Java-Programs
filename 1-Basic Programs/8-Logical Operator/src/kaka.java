
public class kaka {
public static void main(String args[])
{
	//logical operator are called boolean operator 
	//not operator
    boolean rajan= false;
    if(!rajan)
    {
    	System.out.println("I am hari");
    }
    else
    	System.out.println("I am rajan");
    
    int a=8;
    int b=9;
    //and operator
    if((a%2==0) &&(b%3==0))
    	System.out.println("You are awesome");
    //or opetator
    if((a%2==0) ||(b%3!=0))
    	System.out.println("You are not awesome");
    //exclusive or operator
    if((a%2==0) ^ (b%3==0))
    	System.out.println("You are great man");
}
}
