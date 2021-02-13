import java.text.DecimalFormat;
import java.util.Scanner;

// created by J.M.
public class RectangleArea2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());

        double width = Math.max(x1, x2) - Math.min(x1, x2);
        double height = Math.max(y1, y2) - Math.min(y1, y2);
        DecimalFormat decimalFormat = new DecimalFormat("#.#########");

        System.out.println(decimalFormat.format(width * height));
        System.out.println(decimalFormat.format(2 * (width + height)));
    }
}
