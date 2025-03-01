package Cloning;

public class Main {
    public static void main(String[] args) {
        Human abcd = new Human(34,"abcd");
        Human twin = new Human(abcd);
    }
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
