package staticExample;

public class Human {
    String name;
    int age;
    int salary;
    boolean status;
    static int population;
    Human(String name,int age,int salary,boolean status)
    {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.status = status;
        Human.population+=1;
    }
}
