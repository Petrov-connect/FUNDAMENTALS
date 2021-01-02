import java.util.Scanner;

// created by J.M.
public class EqualPairs {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        int[] arr = new int[n];
        int maxDiff = 0;

        for (int i = 0; i < n; i++) {
            int num1 = Integer.parseInt(scan.nextLine());
            int num2 = Integer.parseInt(scan.nextLine());
            arr[i] = num1 + num2;
            if (i > 0) {
                int diff = Math.abs(arr[i - 1] - arr[i]);
                if (diff > maxDiff) {
                    maxDiff = diff;
                }
            }
        }
        if (maxDiff == 0) {
            System.out.println("Yes, value=" + arr[0]);
        } else {
            System.out.println("No, maxdiff=" + maxDiff);
        }
    }
}
