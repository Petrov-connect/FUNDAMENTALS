import java.util.Scanner;
// created by J.M.
public class ChangeTiles {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double  w = Double.parseDouble(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
        final double x = ((n * n) - (a * b)) / (w * h);
        System.out.println(x);
        System.out.println(x *0.2);
    }
}
