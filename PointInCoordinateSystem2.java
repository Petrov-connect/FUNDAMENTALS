import java.util.Scanner;
// created by J.M.
public class PointInCoordinateSystem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h=Integer.parseInt(scan.nextLine());
        int x=Integer.parseInt(scan.nextLine());
        int y=Integer.parseInt(scan.nextLine());
        boolean border=(x==0&&(y>=0&&y<=h))||(y==0&&(x>=0&&x<=h*3))||(x==h*3&&(y>=0&&y<=h))||(y==h&&((x>=0&&x<=h)||(x>=h*2&&x<=h*3)))||(x==h&&(y<=h*4&&y>=h))||(y==h*4&&(x>=h&&x<=h*2))||(x==h*2&&(y>=h&&y<=h*4));
        boolean inside=((x>0&&x<h*3)&&(y>0&&y<h))||((x>h&&x<h*2)&&(y>0&&y<h*4))||((x>h&&x<h*2)&&(y==h));
        if(border){
            System.out.println("border");
        }else if(inside){
            System.out.println("inside");
        }else{
            System.out.println("outside");
        }
    }
}
