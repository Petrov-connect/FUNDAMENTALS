import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

// created by J.M.
public class Operations {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int N1 = Integer.parseInt(scan.nextLine());
        int N2 = Integer.parseInt(scan.nextLine());
        String nOperator = scan.nextLine();

        String output;
        BigDecimal result = new BigDecimal("0.00");
        DecimalFormat intFormatter = new DecimalFormat("0");

        if (N2 == 0 && (nOperator.equals("/") || nOperator.equals("%"))) {
            output = String.format("Cannot divide %d by zero", N1);
        } else if (nOperator.equals("/")) {
            result = new BigDecimal(N1).divide(new BigDecimal(N2), 2, RoundingMode.HALF_UP);
            DecimalFormat decimalFormatter = new DecimalFormat("0.00");
            output = String.format("%d %s %d = %s", N1, nOperator, N2, decimalFormatter.format(result));
        } else if (nOperator.equals("%")) {
            result = new BigDecimal(N1).remainder(new BigDecimal(N2));
            output = String.format("%d %s %d = %s", N1, nOperator, N2, intFormatter.format(result));
        } else {
            switch (nOperator) {
                case "+":
                    result = new BigDecimal((N1 + N2));
                    break;
                case "-":
                    result = new BigDecimal((N1 - N2));
                    break;
                case "*":
                    result = new BigDecimal((N1 * N2));
                    break;
            }
            String numberIs = result.intValueExact() % 2 == 0 ? "even" : "odd";
            output = String.format("%d %s %d = %s - %s", N1, nOperator, N2, intFormatter.format(result), numberIs);
        }
        System.out.println(output);
    }
}
