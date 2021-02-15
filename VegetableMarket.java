import java.util.Scanner;

// created by J.M.
public class VegetableMarket {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        double priceOfVege = Double.parseDouble(scan.nextLine());
        double priceOfFruit = Double.parseDouble(scan.nextLine());
        int totalOfVege = Integer.parseInt(scan.nextLine());
        int totalOfFruit = Integer.parseInt(scan.nextLine());

        System.out.println(((totalOfVege * priceOfVege) + (totalOfFruit * priceOfFruit)) / 1.94);
    }
}
