import java.util.*;
public class Introduction {
    public static void main(String[] args) {
        //store 5 roll Number
        int[] numbers = new int[5];
        
        //store 5 names
        String[] names = new String[5];

        //data of 5 students : {roll no,name,marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        //Classes - Start with capital letter
        //Student[] student = new Student[5];
    //Syntax
    //class ClassName{
    //  int[] rno = new int[5];
    //  String[] name = new String[5];
    //  float[] name = new float[5];
    //  }
    Student[] student = new Student[5];
    Student abc;
    System.out.println(Arrays.toString(student));
    }
}
//Create a class
class Student{
    int rno;
    String name; 
    float marks;
} 
