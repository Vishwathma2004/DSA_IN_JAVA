package OOPS.Generics.comparison;

public class Student implements Comparable<Student>{

    int rollno;
    float marks;
    public Student(int rollno,float marks){
        this.rollno = rollno;
        this.marks = marks;
    }
    public static void main(String[] args) {
        Student stud = new Student(12, 89.9f);
        Student vish = new Student(13, 95.5f);
        if(stud>vish){
            System.out.println("Stud has more mark");
        }
        else{
            System.out.println("Vish has more mark");
        }
    }
}