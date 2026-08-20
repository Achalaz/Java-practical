import java.util.Scanner;
public class Heatcal{
public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    System.out.println("Thsi program is celsienc to Farenhiet calutator");
    System.out.println("-----------------------");
    System.out.println("Enter Celisence value");
    double val=s.nextInt();
    cal(val);
    

}
 
 public static void cal(double val){
        double cel=(val*9/5)+32;
        System.out.println("Ceksicenc value is :: "+cel);


    }
}