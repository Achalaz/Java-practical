import java.util.Scanner;
public class Testcircle{
    public static void main(String[] args){
        Circle c=new Circle();
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
        double r=s.nextDouble();
        c.caldiamiter(r);
        c.calarea(r);
        c.calcircumference(r);
    }
}