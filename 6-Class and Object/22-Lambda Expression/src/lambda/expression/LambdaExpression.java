
package lambda.expression;
//for this we must use the single interface -Functional Interface
 interface abc{
 boolean check(int a);
 }
 
public class LambdaExpression {
    
     
    public static void main(String[] args) {
        abc a= (n) ->  (n%2)==1;
       System.out.println( a.check(5));
    
    }
    
}
