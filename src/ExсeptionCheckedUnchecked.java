import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExсeptionCheckedUnchecked {
    public static void main(String[] args) throws IOException {
        checked();
        unchecked();
        unchecked2();
       // error();
    }


    public static void checked() throws IOException {

            FileInputStream fis = null;
            fis = new FileInputStream("B:/myfile.txt");
            int k;

            while(( k = fis.read() ) != -1)
            {
                System.out.print((char)k);
            }
            fis.close();
    }


  /*  public static void error() {
        while (true){
        if (true){
            System.out.println("if loop");
        }
            System.out.println("while loop");
        }
        System.out.println("while loop");
    }*/

    public static void unchecked() {
        String party = "New Year";
        try{
            String last = party.substring(party.length()/2, party.length()+1);
        }
        catch (StringIndexOutOfBoundsException e){
            System.out.println("Sorry: ");
            e.printStackTrace();
        }
    }

    public static void unchecked2() throws ArithmeticException {
        int a = 23;
        int b = 0;
        System.out.println("a/b=" + a/b);
    }
}
