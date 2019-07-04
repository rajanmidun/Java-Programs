package compostion;

public class second {
	private String name1;
	private third ob;
public second(String name, third obj){
	name1= name;
	ob=obj;
}
public String toString(){
	return String.format("My name is %s, and my birthday is in %s", name1,ob);
}
}
