package compostion;

public class third {
private int month;
private int day;
private int year;
public third(int a,int b ,int c){
	year=a;
	month=b;
	day=c;
}
public String toString(){
	return String.format("%d-%d-%d", year,month,day);
}
}
