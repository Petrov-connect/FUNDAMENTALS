import java.util.Scanner;

// created by J.M.
public class TrainingLab {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double length = Double.parseDouble(scan.nextLine());
        double width = Double.parseDouble(scan.nextLine());

        System.out.printf("%d", (((int) (((width * 100) - 100) / 70) * (int) ((length * 100) / 120)) - 3));
    }
}
