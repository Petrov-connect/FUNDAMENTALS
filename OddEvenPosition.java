import java.text.DecimalFormat;
import java.util.Scanner;

// created by J.M.
public class OddEvenPosition {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int number = Integer.parseInt(scan.nextLine());

        double OddSum = 0.00;
        double EvenSum = 0.00;
        double OddMin = 1000000000.0;
        double EvenMin = 1000000000.0;
        double OddMax = -1000000000.0;
        double EvenMax = -1000000000.0;

        DecimalFormat output = new DecimalFormat("#.##");

        for (int i = 1; i <= number; i++) {
            double num = Double.parseDouble(scan.nextLine());
            if (i % 2 == 0) {
                EvenSum += num;
                if (num > EvenMax) {
                    EvenMax = num;
                }
                if (num < EvenMin) {
                    EvenMin = num;
                }

            } else {
                OddSum += num;
                if (num > OddMax) {
                    OddMax = num;
                }
                if (num < OddMin) {
                    OddMin = num;
                }
            }
        }
        System.out.println("OddSum=" + output.format(OddSum));
        if (OddMin == 1000000000.0) {
            System.out.println("OddMin=No,");
        } else {
            System.out.println("OddMin=" + output.format(OddMin));
        }
        if (OddMax == -1000000000.0) {
            System.out.println("OddMax=No,");
        } else {
            System.out.println("OddMax=" + output.format(OddMax));
        }

        System.out.println("EvenSum=" + output.format(EvenSum));

        if (EvenMin == 1000000000.0) {
            System.out.println("EvenMin=No,");
        } else {
            System.out.println("EvenMin=" + output.format(EvenMin));
        }

        if (EvenMax == -1000000000.0) {
            System.out.println("EvenMax=No");
        } else {
            System.out.println("EvenMax=" + output.format(EvenMax));
        }
    }
}
