import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import static java.util.Locale.GERMANY;
import java.util.Date;

public class Seeeion_13_GrigCalendar {
    public static void main(String[] args) {
        SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy EEEEE");
        /*GregorianCalendar cd = new GregorianCalendar(GERMANY);
        int day = 20;
        cd.set(1990, 11, day);
        GregorianCalendar newCalender = new GregorianCalendar( 1990, 10, 20);
        cd.add(Calendar.DATE, -50);
        System.out.println( ft.format(cd.getTime()));
        cd.roll(Calendar.YEAR, true);
        System.out.println( ft.format(cd.getTime()));
        cd.setTime(new Date());
        System.out.println( ft.format(cd.getTime()));*/
        GregorianCalendar birthdayUliana = new GregorianCalendar(GERMANY);
        birthdayUliana.set(2014, Calendar.AUGUST, 28);
        GregorianCalendar birthdayDariya = new GregorianCalendar(GERMANY);
        birthdayDariya.set(2010, Calendar.OCTOBER, 28);
        Date dateofBirthDariya = birthdayDariya.getTime();

        Date dateofBirthUliana = birthdayUliana.getTime();
        System.out.println(ft.format(dateofBirthDariya) + " && " + ft.format(dateofBirthUliana));
        long timeDistanse = dateofBirthUliana.getTime() - dateofBirthDariya.getTime();
        System.out.println(timeDistanse/86400000);
        Date start = new Date(0, 00, 00);
        System.out.println(" start " + (ft.format(start)));
        Date distance = new Date (timeDistanse + start.getTime());
        System.out.println(" Testing " + (ft.format(distance)));
        System.out.println("Start Time" + new Date (0));
        birthdayDariya.roll(Calendar.MONTH, -2);
        System.out.println(ft.format(birthdayDariya.getTime()));

    }
}
