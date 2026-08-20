import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        System.out.println("________________________________________");
        System.out.println("Welcome to the Banking System");
        System.out.println("________________________________________");
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accountNum=sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String accountHolder=sc.nextLine();
        Bankacc account=new Bankacc(accountNum,accountHolder);
        account.display();
    }
}