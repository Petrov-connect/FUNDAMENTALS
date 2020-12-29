//created by J.M.
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Diamond {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=Integer.parseInt(scan.nextLine());
        int leftRight=(n-1)/2;
        for (int i = 0; i < n/2-1; i++) {
            System.out.print(generateFrom(leftRight));
            System.out.print("*");
            int mid=n-2*leftRight-2;
            if(mid>=0){
                System.out.print(generateFrom(leftRight));
                System.out.print("*");
            }
            System.out.println(generateFrom(leftRight));
            leftRight--;
        }
        for (int i = 0; i < (n-1)/2; i++) {
            leftRight++;
            System.out.print(generateFrom(leftRight));
            System.out.print("*");
            int mid=n-2*leftRight-2;
            if(mid>=0){
                System.out.print(generateFrom(leftRight));
                System.out.print("*");
            }
            System.out.println(generateFrom(leftRight));
        }
    }

    private static String generateFrom(int repeat) {

        return IntStream.range(0, repeat).mapToObj(i -> "-").collect(Collectors.joining());
    }
}
