import java.util.Scanner;

// created by J.M.
public class USDtoBGN {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double usd = Double.parseDouble(scan.nextLine());

        System.out.printf("%.2f", usd * 1.79549);
    }
}
