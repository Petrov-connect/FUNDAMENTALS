import java.util.Scanner;
// created by J.M.
public class Money {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int bit=Integer.parseInt(scan.nextLine());
        double yoa=Double.parseDouble(scan.nextLine());
        double com=Double.parseDouble(scan.nextLine());
        System.out.println(((yoa*0.15*1.76+bit*1168)/1.95)*((100-com)/100));
    }
}
