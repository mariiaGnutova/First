import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TimeConversion {
    public static void main(String[] args) {
System.out.print(timeConversion2("12:00:00AM"));
    }
    static String timeConversion(String s) {
        s = s.trim().toUpperCase();
        String ohr = s.substring(0, 2);
        if (s.contains("AM") && (!ohr.equals("12"))) {
            return s.substring(0, s.length() - 2);
        } else if (s.contains("AM") && (ohr.equals("12"))){
            return "00" + s.substring(2, s.length() - 2);
        }
        else {
            if (!ohr.equals("12")){
                int pm = Integer.parseInt(s.substring(0, 2)) + 12;
                ohr = String.valueOf(pm);
            }

            return ohr + s.substring(2, s.length() - 2);
        }

    }
    static String timeConversion2 (String s){
        if (s.equals("12:00:00AM")){
            return "00:00:00";
        }
        CharSequence cs = s;
        LocalTime timeForConv = LocalTime.parse(cs, DateTimeFormatter.ofPattern("hh:mm:ssa"));
        timeForConv.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
        return timeForConv.toString();
    }
}
