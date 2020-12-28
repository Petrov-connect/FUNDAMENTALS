import java.util.Scanner;
// created by J.M.
public class SquareArea {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("a= ");
        int a=Integer.parseInt(scan.nextLine());
        System.out.printf("Square area = %d",a*a);
    }
}
