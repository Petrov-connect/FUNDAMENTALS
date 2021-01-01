import java.util.Scanner;

// created by J.M.
public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double celsius = Double.parseDouble(scan.nextLine());

        double result = (celsius * 9 / 5) + 32;

        System.out.printf("%.2f", result);
    }
}

