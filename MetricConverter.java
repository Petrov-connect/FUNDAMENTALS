import java.util.Scanner;
// created by J.M.
public class MetricConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num = Double.parseDouble(scan.nextLine());
        String inputMetric=scan.nextLine().toLowerCase();
        String exitMetric=scan.nextLine().toLowerCase();
            switch (inputMetric) {
                case "mm": num /= 1000;           break;
                case "cm": num /= 100;            break;
                case "mi": num /= 0.000621371192; break;
                case "in": num /= 39.3700787;     break;
                case "km": num /= 0.001;          break;
                case "ft": num /= 3.2808399;      break;
                case "yd": num /= 1.0936133;      break;
            }
            switch (exitMetric) {
                case "mm": num *= 1000;           break;
                case "cm": num *= 100;            break;
                case "mi": num *= 0.000621371192; break;
                case "in": num *= 39.3700787;     break;
                case "km": num *= 0.001;          break;
                case "ft": num *= 3.2808399;      break;
                case "yd": num *= 1.0936133;      break;
            }
        System.out.printf("%.14f",num);
    }
}
