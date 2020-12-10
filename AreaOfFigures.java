import java.util.Scanner;
// created by J.M.
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        if (figure.equals("square")) {
            double a = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", (a * a));
        } else if (figure.equals("rectangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", (a * b));
        } else if (figure.equals("circle")) {
            double a = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", (Math.PI * a * a));
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scan.nextLine());
            double b = Double.parseDouble(scan.nextLine());
            System.out.printf("%.3f", (a * b / 2));
        }
    }
}
