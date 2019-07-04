
package create.own.exception;

public class CreateOwnException {

    
    public static void main(String[] args) {
        try{
            int k=0;
            if(k==0)
                throw new RajanException("Hello rajan");
        }
     catch(RajanException e){
        System.out.println("Error "+e.getMessage());
     }
    }
    
}
