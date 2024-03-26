import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class bai22_calendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yy hh:mm:ss a");
        Date date = calendar.getTime();

        String formattedDate = dateFormat.format(date);
        System.out.println(formattedDate);


    }
}
