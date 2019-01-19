import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class Session_16_Stream {

    public static void main(String[] args) throws IOException {
        FileInputStream in = null;
        FileInputStream in2 = null;//define Stream
        FileOutputStream out = null;
        FileOutputStream out2 = null;
        try{
            in = new FileInputStream("/Users/mariagnutova/Documents/111.txt");
            in2 = new FileInputStream("text.txt");
            out = new FileOutputStream("output.txt"); //output will be created with this name
            out2 = new FileOutputStream("output2.txt");
            int c;
            while ( (c = in.read()) !=-1){ //if it's not the end of file
                out.write(c);
               // out2.flush(); //will sent directly to the file
            }
            while ( (c = in2.read()) !=-1){ //if it's not the end of file
                out2.write(c);
                // out2.flush(); //will sent directly to the file
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        finally {
            toCloseIn(in);
            toCloseIn(in2);
            toCloseOut(out);
            toCloseOut(out2);
        }

    }
    public static void toCloseOut (FileOutputStream beClosed) throws IOException {
        if (beClosed != null){
            beClosed.close();
        }
    }
    public static void toCloseIn (FileInputStream beClosed) throws IOException {
        if (beClosed != null){
            beClosed.close();
        }
    }

}
