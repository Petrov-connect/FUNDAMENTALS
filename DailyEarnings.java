import java.util.Scanner;
// created by J.M.
public class DailyEarnings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int workDays=Integer.parseInt(scan.nextLine());
        double earnPerDay=Double.parseDouble(scan.nextLine());
        double usdToBgn=Double.parseDouble(scan.nextLine());
        double perMont=earnPerDay*workDays;
        double bonus=perMont*2.5;
        double total=(perMont*12+bonus)*0.75;
        System.out.printf("%.2f",total/365*usdToBgn);
    }
}


