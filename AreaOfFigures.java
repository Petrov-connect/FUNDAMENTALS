import java.util.Scanner;
// created by J.M.
public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String figure = scan.nextLine();
        switch (figure) {
            case "square": {
                double a = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f", (a * a));
                break;
            }
            case "rectangle": {
                double a = Double.parseDouble(scan.nextLine());
                double b = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f", (a * b));
                break;
            }
            case "circle": {
                double a = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f", (Math.PI * a * a));
                break;
            }
            case "triangle": {
                double a = Double.parseDouble(scan.nextLine());
                double b = Double.parseDouble(scan.nextLine());
                System.out.printf("%.3f", (a * b / 2));
                break;
            }
        }
    }
}
