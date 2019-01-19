import javax.swing.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Session_11 {
    public static void main(String[] args) {
        SimpleDateFormat sf = new SimpleDateFormat("<HH:mm:sss>-*-<ddddddddd>-*-<M>-*-<MMM>-*-<MMMMM>-*-<yyyyyy>-*-<G>-*-<Z>-*-<h:ma>");
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
        Date dateBefore = new Date();
    //    doLongOperation();
        Date dateAfter = new Date();
        long compare = dateAfter.getTime() - dateBefore.getTime();
        //System.out.println("Perfomance time: " + compare/1000);
       // System.out.println(sf.format(dateAfter));
        String input = JOptionPane.showInputDialog("Type in your birthdate: ");
        System.out.print(input + " Parses as ");
        Date t;
        try {
            t = ft.parse(input);
            System.out.print(new SimpleDateFormat("EEEEE, MM , dd , YYYY").format(t));
        }catch (ParseException e){
            System.out.println("Unparseable using " + ft);
        }
    }
    private static void doLongOperation(){
        try{
            Thread.sleep(2);
        }
        catch (Exception ex){

        }
    }
}