public class Student{

    private String name;
    private int age;
    private String subject;
    private int Marks;
    private String grade;


    void setName(String name){
        this.name=name;

    }
    void setAge(int age){
        this.age=age;
    }
    void setSubject(String subject){
        this.subject=subject;
    }
    void setGrade(String grade){
        this.grade=grade;
    }
    void calculateGrade(){
        if(grade>=90){
            this.grade="A";
        }
        else if(grade>=80){
            this.grade="B";
        }
        else if(grade>=70){
            this.grade="C";
        }
        else if(grade>=60){
            this.grade="D";
        }
        else{
            this.grade="F";
        }
    }
}
void display(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
    System.out.println("Subject: "+subject);
    System.out.println("Marks: "+Marks);
    System.out.println("Grade: "+grade);
}