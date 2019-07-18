package bufferreader.and.printwriter;

import java.io.*;

public class BufferReaderAndPrintWriter {

    public static void main(String[] args) throws IOException {
        BufferedReader in = null;
        PrintWriter out = null;
        try {
           in= new BufferedReader(new FileReader("src.txt"));
           out=new PrintWriter(new FileWriter("des.txt"));
           String text="";
           while((text=in.readLine())!=null)
               out.println(text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {

              if(in!=null)
                  in.close();
              if(out!=null)
                  out.close();
           
    }
    }

}
