import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ChangeDateFormate {
    public  Date Changetodate(String date) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            // Parse the date string
            return dateFormat.parse(date);
        } catch (ParseException e) {
            // If parsing fails, handle the exception
            return null;
        }
    }
}
