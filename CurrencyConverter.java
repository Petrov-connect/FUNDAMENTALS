import java.util.Scanner;
// created by J.M.
public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double num=Double.parseDouble(scan.nextLine());
        String type1=scan.nextLine();
        String type2=scan.nextLine();
        double sum=0;
        switch (type1){
            case"BGN":
                switch(type2){
                    case"USD": sum=num/1.79549; break;
                    case"EUR": sum=num/1.95583; break;
                    case"GBP": sum=num/2.53405; break;
                }
                break;
            case"USD":
                switch(type2){
                    case"BGN": sum=num*1.79549; break;
                    case"EUR": sum=num/(1.95583/1.79549); break;
                    case"GBP": sum=num/(2.53405/1.79549); break;
                }
                break;
            case"EUR":
                switch(type2){
                    case"BGN": sum=num*1.95583; break;
                    case"USD": sum=num*(1.95583/1.79549); break;
                    case"GBP": sum=num/(2.53405/1.95583); break;
                }
                break;
                case"GBP":
                switch(type2){
                    case"BGN": sum=num*2.53405; break;
                    case"EUR": sum=num*(2.53405/1.95583); break;
                    case"USD": sum=num*(2.53405/1.79549); break;
                }
                break;
        }
        System.out.printf("%.2f",sum);
    }
}
