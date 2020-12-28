import java.util.Scanner;
// created by J.M.
public class TimePlusMinutes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int hours = Integer.parseInt(scan.nextLine());
        int minutes = Integer.parseInt(scan.nextLine());
        int totalMinutes = hours * 60 + minutes + 15;
        int h = totalMinutes / 60;
        int m = totalMinutes % 60;
        if (h >= 24) {
            h -= 24;
        }
        System.out.printf("%d:%02d", h, m);
    }
}
