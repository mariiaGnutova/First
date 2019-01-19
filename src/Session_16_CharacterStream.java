import java.io.*;
public class Session_16_CharacterStream {

    public static void main(String args[]) throws IOException {
            FileReader in = null;
            FileWriter out = null;

            try {
                in = new FileReader("output.txt");
                out = new FileWriter("output_Character.txt");

                int c;
                while ((c = in.read()) != -1) {
                    out.write(c);
                }
            }finally {
                if (in != null) {
                    in.close();
                }
                if (out != null) {
                    out.close();
                }
            }
        }

}
