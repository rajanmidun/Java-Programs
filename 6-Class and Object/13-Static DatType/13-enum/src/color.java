import java.util.EnumSet;
public enum color {
 rajan("Kaka",567),
 mama("mamphuli",23),
 kaka("daka",453);
 
 private String name1;
 private int a;
 color(String name, int i){
	 name1=name;
	 a=i;
 }
 public String getname(){
    return name1;	 
 }
 public int getid(){
	 return a;
 }
 }
