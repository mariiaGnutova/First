import jdk.jfr.events.FileReadEvent;

import java.io.*;

public class Session16_Reader {

    public static void main(String[] args) throws IOException {

        cloneMe("/Users/mariagnutova/Documents/111.txt", "output5.txt");

    }

    public static void toCloseOut (FileWriter beClosed) throws IOException {
        if (beClosed != null){
            beClosed.close();
        }
    }

    public static void toCloseIn (FileReader beClosed) throws IOException {
        if (beClosed != null){
            beClosed.close();
        }
    }

    public static void cloneMe ( String fileInput, String fileOut) throws IOException {
        FileReader toBeRead = null;
        FileWriter toWrite = null;
        try{
            toBeRead = new FileReader(fileInput);
            toWrite = new FileWriter(fileOut);

            int c;
            while ( (c = toBeRead.read()) !=-1){ //if it's not the end of file
                toWrite.write(c);
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            toCloseIn(toBeRead);
            toCloseOut(toWrite);

        }
    }

}
