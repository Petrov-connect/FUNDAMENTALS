import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
// created by J.M.
public class DaysAfterBirth2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String birthDay = scan.nextLine();
        DateTimeFormatter dateTimeFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate after1000d = LocalDate.parse(birthDay, dateTimeFormat).plusDays(1000);
        System.out.println(dateTimeFormat.format(after1000d));
    }
}
