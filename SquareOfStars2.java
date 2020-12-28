import java.util.Scanner;
// created by J.M.
public class SquareOfStars2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int n = Integer.parseInt(console.nextLine());
        String star = "*".repeat(n);
        String space = " ".repeat(n-2);
        System.out.println(star);
        for (int i=0 ; i<n-2; i++) {
            System.out.print("*");
            System.out.print(space);
            System.out.println("*");
        }
        System.out.println(star);
    }
}
