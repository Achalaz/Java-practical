import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Student student=new Student();
        System.out.println("Enter the name of the student:");
        String name=s.nextLine();
        System.out.println("Enter the age of the student:");
        int age=s.nextInt();
        System.out.println("Enter the subject of the student:");
        String subject=s.next();
        System.out.println("Enter the marks of the student:");
        int marks=s.nextInt();
        Student s=new Student();
        Student.setName(name);
        Student.setAge(age);
        Student.setSubject(subject);
        Student.setMarks(marks);
        Student.calculateGrade();
        Student.display();
    }

}