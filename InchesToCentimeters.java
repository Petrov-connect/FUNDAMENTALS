import java.util.Scanner;

// created by J.M.
public class InchesToCentimeters {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Inches = ");
        double inches = Double.parseDouble(scan.nextLine());

        System.out.printf("Centimeters = %f", inches * 2.54);
    }
}
