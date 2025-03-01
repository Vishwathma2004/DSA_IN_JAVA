package staticExample;

public class Main {
    public static void main(String[] args) {
        Human abc = new Human("abc", 10, 10000, false);
        Human def = new Human("def", 11, 15000, true);
        System.out.println(abc.population);
        System.out.println(def.population);
    }
}
