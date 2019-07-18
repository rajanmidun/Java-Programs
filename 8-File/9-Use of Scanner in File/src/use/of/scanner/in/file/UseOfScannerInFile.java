package use.of.scanner.in.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UseOfScannerInFile {
 
    public static void main(String[] args) {
       Scanner in; 
        try {
            in = new Scanner(new File("rajan.txt"));
            while(in.hasNext()){
                System.out.println(in.nextLine());
       }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(UseOfScannerInFile.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
