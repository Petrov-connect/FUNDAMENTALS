import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

// created by J.M.
public class Trip {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigDecimal budget = new BigDecimal(scan.nextLine());
        String season = scan.nextLine().toLowerCase();

        String destinationResult;
        String holidayInformation;
        new BigDecimal("0.00");
        BigDecimal moneySpend;
        DecimalFormat formatter = new DecimalFormat("0.00");

        if (budget.compareTo(BigDecimal.valueOf(100.00)) <= 0) {
            destinationResult = "Bulgaria";
            if (season.equals("summer")) {
                moneySpend = BigDecimal.valueOf(0.30).multiply(budget);
                holidayInformation = String.format("Camp - %s", formatter.format(moneySpend));
            } else {
                moneySpend = BigDecimal.valueOf(0.70).multiply(budget);
                holidayInformation = String.format("Hotel - %s", formatter.format(moneySpend));
            }
        } else if (budget.compareTo(BigDecimal.valueOf(1000.00)) <= 0) {
            destinationResult = "Balkans";
            if (season.equals("summer")) {
                moneySpend = BigDecimal.valueOf(0.40).multiply(budget);
                holidayInformation = String.format("Camp - %s", formatter.format(moneySpend));
            } else {
                moneySpend = BigDecimal.valueOf(0.80).multiply(budget);
                holidayInformation = String.format("Hotel - %s", formatter.format(moneySpend));
            }
        } else {
            destinationResult = "Europe";
            moneySpend = BigDecimal.valueOf(0.90).multiply(budget);
            holidayInformation = String.format("Hotel - %s", formatter.format(moneySpend));
        }
        System.out.printf("Somewhere in %s%n", destinationResult);
        System.out.println(holidayInformation);
    }
}