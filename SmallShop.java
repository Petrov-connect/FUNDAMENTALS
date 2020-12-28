import java.util.Scanner;
// created by J.M.
public class SmallShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String product = scan.nextLine();
        String town = scan.nextLine();
        double quantity = Double.parseDouble(scan.nextLine());
        double price = 0.0;
        switch (town) {
            case "Sofia":
                if ("coffee".equals(product)) {
                    price = 0.5;
                } else if ("water".equals(product)) {
                    price = 0.8;
                } else if ("beer".equals(product)) {
                    price = 1.2;
                } else if ("sweets".equals(product)) {
                    price = 1.45;
                } else if ("peanuts".equals(product)) {
                    price = 1.60;
                }
                break;
            case "Plovdiv":
                if ("coffee".equals(product)) {
                    price = 0.4;
                } else if ("water".equals(product)) {
                    price = 0.7;
                } else if ("beer".equals(product)) {
                    price = 1.15;
                } else if ("sweets".equals(product)) {
                    price = 1.3;
                } else if ("peanuts".equals(product)) {
                    price = 1.50;
                }
                break;
            case "Varna":
                if ("coffee".equals(product)) {
                    price = 0.45;
                } else if ("water".equals(product)) {
                    price = 0.7;
                } else if ("beer".equals(product)) {
                    price = 1.1;
                } else if ("sweets".equals(product)) {
                    price = 1.35;
                } else if ("peanuts".equals(product)) {
                    price = 1.55;
                }
                break;
        }
        System.out.println(quantity*price);
    }
}

