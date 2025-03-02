public class Contructor {
    public static void main(String[] args) {
        Student abcd = new Student(100,"Alice",90.1f);
        System.out.println();
        abcd.greeting();
        abcd.changeName("Bob");
        System.out.println();
        abcd.greeting();
        Student random = new Student(abcd);
        System.out.println();
        random.greeting();
        System.out.println(random.name);
        Student one = new Student();
        Student two = one;
        one.name ="Something";
        System.out.println(two.name); 
        
    }
}
class Student{
    int rno;
    String name;
    float marks;

    void greeting(){
        System.out.println("Hello My name is "+name);
    }

    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
    Student(){
        this.rno = 45;
        this.name = "abc";
        this.marks = 88.8f;
    }
    void changeName(String newName){
        name = newName;
    }
    Student(int rollno,String namee,float markss){
        rno = rollno;
        name = namee;
        marks = markss;
    }
    //call constructor from another constructor
    // Student(){
    //     this(45,"abc",88.8f);
    // }
}