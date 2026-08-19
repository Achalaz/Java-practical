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
        
        student.setName(name);
        student.setAge(age);
        student.setSubject(subject);
        student.setMarks(marks);
        student.calculateGrade();
        student.display();
        s.close();
    }

}