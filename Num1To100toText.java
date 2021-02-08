import java.util.Scanner;

// created by J.M.
public class Num1To100toText {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());

        String[] shortName = new String[]{"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve"};
        String[] compositeName = new String[]{"twen", "thir", "four", "fif", "six", "seven", "eigh", "nine"};
        String name;

        if ((number < 0) || (number > 100)) {
            name = "invalid number";
        } else if (number < 13) {
            name = shortName[number];
        } else if (number < 20) {
            name = compositeName[number % 10 - 2] + "teen";
        } else if (number < 100) {
            if (number / 10 == 4) name = "forty";
            else name = compositeName[number / 10 - 2] + "ty";
            if (number % 10 != 0)
                name += " " + shortName[number % 10];
        } else // number = 100
            name = "one hundred";
        System.out.println(name);
    }
}