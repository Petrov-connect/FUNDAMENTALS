import java.util.Scanner;

// created by J.M.
public class RectangleArea {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());

        int area = a * b;

        System.out.println(area);
    }
}