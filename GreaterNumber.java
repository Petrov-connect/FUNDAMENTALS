import java.util.Scanner;

// created by J.M.
public class GreaterNumber {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num1 = Integer.parseInt(scan.nextLine());
        int num2 = Integer.parseInt(scan.nextLine());

        System.out.println(Math.max(num1, num2));
    }
}

