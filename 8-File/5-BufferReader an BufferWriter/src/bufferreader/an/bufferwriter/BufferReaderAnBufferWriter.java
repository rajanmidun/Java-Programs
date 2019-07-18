package bufferreader.an.bufferwriter;

import java.io.*;

public class BufferReaderAnBufferWriter {

    public static void main(String[] args) {
        BufferedReader bufferReader = null;
        BufferedWriter bufferWriter = null;
        try {
            bufferReader = new BufferedReader(new FileReader(new File("rajan.txt")));
            String data = "";
            bufferWriter = new BufferedWriter(new FileWriter(new File("midun.txt")));

            while ((data = bufferReader.readLine()) != null) {
                bufferWriter.write(data+"\n");
                System.out.println(bufferReader.readLine());
            }
            //bufferWriter.write(data);

        } catch (Exception e) {

        } finally {
            try {
                if (bufferWriter != null) {
                    bufferWriter.close();
                }
                if (bufferReader != null) {
                    bufferReader.close();
                }
            } catch (Exception e) {
            }
        }

    }

}
