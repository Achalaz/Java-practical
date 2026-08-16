import java.util.Scanner;
public class Main{
    public static void main(String[] args){
    System.out.println("Enter name:");
    Scanner scanner=new Scanner(System.in);
    String name=scanner.nextLine();
    System.out.println("Enter age:");
    int age=scanner.nextInt();
    Student student=new Student(name, age);
    student.displayInfo();
}
}