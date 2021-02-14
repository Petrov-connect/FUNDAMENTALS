import java.util.Scanner;

// created by J.M.
public class SumSeconds {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int time1 = Integer.parseInt(scan.nextLine());
        int time2 = Integer.parseInt(scan.nextLine());
        int time3 = Integer.parseInt(scan.nextLine());

        int totalTime = time1 + time2 + time3;
        int minute = totalTime / 60;
        int second = totalTime % 60;

        if (second < 10) {
            System.out.printf("%d:%02d", minute, second);
        } else {
            System.out.printf("%d:%d", minute, second);
        }
    }
}
