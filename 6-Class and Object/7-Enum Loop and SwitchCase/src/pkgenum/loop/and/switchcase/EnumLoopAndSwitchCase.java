
package pkgenum.loop.and.switchcase;


public class EnumLoopAndSwitchCase {

 enum Info{
 RAJAN,
 HARI,
 GITA,
 MINA,
 SHYAM;
 }
    public static void main(String[] args) {
       for(Info inf: Info.values())
           System.out.println(inf);
       
    Info inf=Info.GITA;
    switch(inf)
            {
            case RAJAN:
            System.out.println("Rajan is selected");
            break;
            
            case HARI:
            System.out.println("Hari is selected");
            break;
            
            case GITA:
            System.out.println("Gita is selected");
            break;
            
            case MINA:
            System.out.println("Mina is selected");
            break;
            
            case SHYAM:
            System.out.println("Shyam is selected");
            break;
            
            default:
            System.out.println("Noone is selected");
                break;
           }
    }
    
}
