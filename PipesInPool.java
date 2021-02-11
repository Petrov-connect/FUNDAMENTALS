import java.util.Scanner;

// created by J.M.
public class PipesInPool {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int v = Integer.parseInt(scan.nextLine());
        int p1 = Integer.parseInt(scan.nextLine());
        int p2 = Integer.parseInt(scan.nextLine());
        double h = Double.parseDouble(scan.nextLine());

        double full = p1 * h + p2 * h;
        double prcFull = full / v * 100;
        double prcP1 = p1 * h / full * 100;
        double prcP2 = p2 * h / full * 100;

        if (full > v) {
            System.out.printf("For %f hours the pool overflows with %f liters.", h, full - v);
        } else {
            System.out.printf("The pool is %.0f%% full. Pipe 1: %.0f%%. Pipe 2: %.0f%%.", Math.floor(prcFull), Math.floor(prcP1), Math.floor(prcP2));
        }
    }
}
