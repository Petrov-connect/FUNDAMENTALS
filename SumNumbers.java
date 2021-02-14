import java.util.Scanner;

// created by J.M.
public class SumNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            int a = Integer.parseInt(scan.nextLine());
            sum += a;
        }
        System.out.println(sum);
    }
}
