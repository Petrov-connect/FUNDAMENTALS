import java.util.Scanner;

// created by J.M.
public class ExcellentResult {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double evaluation = Double.parseDouble(scan.nextLine());

        if (evaluation >= 5.50) {
            System.out.println("Excellent!");
        }
    }
}
