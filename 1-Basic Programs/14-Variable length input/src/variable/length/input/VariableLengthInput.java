package variable.length.input;
class variable{
        int total=0;
         public int returnData(int...num)
         {
           for(int x:num) 
           {
               total+=x;
           }
           return total;
         }      
}
public class VariableLengthInput {

  
    public static void main(String[] args) {
        variable obj= new variable();
         int data=obj.returnData(1,2,3,4,5,6);
         System.out.println(data);
    }
    
}
