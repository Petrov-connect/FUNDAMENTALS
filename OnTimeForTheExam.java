import java.util.Scanner;
// created by J.M.
public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int examHours=Integer.parseInt(scan.nextLine());
        int examMinutes=Integer.parseInt(scan.nextLine());
        int arrivalHours=Integer.parseInt(scan.nextLine());
        int arrivalMinutes=Integer.parseInt(scan.nextLine());

        int examTime=examHours*60+examMinutes;
        int arrivalTime=arrivalHours*60+arrivalMinutes;
        int totalMinutesDifference=arrivalTime-examTime;

        String studentArrival;

        if (totalMinutesDifference<-30){
            studentArrival="Early";
        }else if(totalMinutesDifference>0){
            studentArrival="Late";
        }else {
            studentArrival="On time";
        }

        String result="";

        if(totalMinutesDifference!=0){
            int hoursDifference=Math.abs(totalMinutesDifference/60);
            int minuteDifference=Math.abs(totalMinutesDifference%60);
            if(hoursDifference>0){
                result=String.format("%d:%02d hours",hoursDifference,minuteDifference);
            }else {
                result=minuteDifference+" minutes";
            }
            if(totalMinutesDifference<0){
                result+=" before the start";
            }else {
              result+=" after the start";
            }
        }
            System.out.println(studentArrival);
            if (!result.isEmpty()){
                System.out.println(result);
            }
    }
}
