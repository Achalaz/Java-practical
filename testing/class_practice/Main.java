import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the brand of the car:");
        String brand=s.nextLine();
        System.out.println("Enter the model of the car:");
        String model=s.nextLine();
        System.out.println("Enter the year of the car:");
        int year=s.nextInt();
        Car car=new Car(brand,model,year);
        car.displayInfo();

    }
    }