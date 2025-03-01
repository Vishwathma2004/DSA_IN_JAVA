import java.util.*;
public class Class {
    public static void main(String[] args) {
        //Allocates memory at RunTime(dynamically allocate memory)
        Student[] student = new Student[5];
        System.out.println(Arrays.toString(student));
        Student abc = new Student();
        //or
        //Student abc;
        //abc = new Student();//constructor
        abc.name = "apple";
        abc.marks = 99.9f;
        abc.rno = 101;
        //constructor is special type of function in the class.

        System.out.println(abc);//Print Random value
        System.out.println(abc.rno);//By default it gives ZERO
        System.out.println(abc.name);//By default it gives null
        System.out.println(abc.marks);//By default it gives 0.0
    }
}

class Student{
    int rno;
    String name;
    float marks;
    
    
}