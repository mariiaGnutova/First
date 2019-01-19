import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Session15_Exception {
    public static void main(String[] args){
      System.out.println("returned: " + test());
    }
    public static int test() {
        try {
            FileInputStream file = new FileInputStream("");
            byte x = (byte) file.read();
            Thread.sleep(5000);
            return 0;
        } catch (FileNotFoundException f) {
            f.printStackTrace();
            return -1;
        } catch (IOException i) {
            i.printStackTrace();
            return -1;
        } catch (InterruptedException ex){
            ex.printStackTrace();
            return -1;
        }
        catch (Exception exc){
            exc.printStackTrace();
         throw exc;

        } finally {
            System.out.println("Have a good day!");
        }
    }
}
