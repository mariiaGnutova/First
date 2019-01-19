import java.text.SimpleDateFormat;
import java.util.Date;

public class Session_13_Date {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy EEEEEE");
        Date dateBefore = new Date();
        System.out.printf(" %s %tc", "Due Date is: ", dateBefore);
        System.out.println();
        String date = ft.format(dateBefore);
        System.out.printf(" %s %s", "Due Date is: ", date);
        System.out.println();
        System.out.printf(" %1$s %2$tB, %2$tY", "Due Date is:", new Date());
        System.out.println();
        System.out.printf(" %s %<s %tB %<te, %<tY => %<tA %<tr", "Due Date is:", new Date());
    }
}
