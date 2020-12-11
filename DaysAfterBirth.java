import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.ParseException;
// created by J.M.
public class DaysAfterBirth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String oldDate = scan.nextLine();
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Calendar c = Calendar.getInstance();
        try{
            c.setTime(sdf.parse(oldDate));
        }catch(ParseException e){
            e.printStackTrace();
        }
        c.add(Calendar.DAY_OF_MONTH, 999);
        String newDate = sdf.format(c.getTime());
        System.out.println(newDate);
    }
}
