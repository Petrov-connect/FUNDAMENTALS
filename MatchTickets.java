import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

// created by J.M.
public class MatchTickets {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BigDecimal budget = new BigDecimal(scan.nextLine());
        String ticketType = scan.nextLine();
        int people = Integer.parseInt(scan.nextLine());

        new BigDecimal("0.00");
        BigDecimal transportCharges;
        new BigDecimal("0.00");
        BigDecimal moneyForTickets;
        new BigDecimal("0.00");

        if (people <= 4) {
            transportCharges = new BigDecimal("0.75").multiply(budget);
        } else if (people <= 9) {
            transportCharges = new BigDecimal("0.60").multiply(budget);
        } else if (people <= 24) {
            transportCharges = new BigDecimal("0.50").multiply(budget);
        } else if (people <= 49) transportCharges = new BigDecimal("0.40").multiply(budget);
        else {
            transportCharges = new BigDecimal("0.25").multiply(budget);
        }
        switch (ticketType) {
            case "Normal":
                moneyForTickets = new BigDecimal(people).multiply(new BigDecimal("249.99"));
                break;
            case "VIP":
                moneyForTickets = new BigDecimal(people).multiply(new BigDecimal("499.99"));
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + ticketType);
        }
        DecimalFormat decimalFormatter = new DecimalFormat("0.00");
        BigDecimal moneyDifference = budget.subtract(transportCharges.add(moneyForTickets));
        String result = String.format("Yes! You have %s leva left.", decimalFormatter.format(moneyDifference));

        if (moneyDifference.compareTo(BigDecimal.valueOf(0)) < 0) {
            result = String.format("Not enough money! You need %s leva.", decimalFormatter.format(moneyDifference));
        }
        System.out.println(result);
    }
}
