import java.util.Scanner;
// created by J.M.
public class PointInRectangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1 = Double.parseDouble(scan.nextLine());
        double y1 = Double.parseDouble(scan.nextLine());
        double x2 = Double.parseDouble(scan.nextLine());
        double y2 = Double.parseDouble(scan.nextLine());
        double x = Double.parseDouble(scan.nextLine());
        double y = Double.parseDouble(scan.nextLine());

        if ((y >= y1 && y <= y2)&&(x >= x1 && x <= x2)) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }
    }
}
