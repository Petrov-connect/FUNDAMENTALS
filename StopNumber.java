import java.util.Scanner;
// created by J.M.
public class StopNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        int m = Integer.parseInt(scan.nextLine());
        int s = Integer.parseInt(scan.nextLine());

        for (int i = m; i >= n; i--) {
            if (i % 2 == 0 && i % 3 == 0) {
                if (s == i) {
                    break;
                } else {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
