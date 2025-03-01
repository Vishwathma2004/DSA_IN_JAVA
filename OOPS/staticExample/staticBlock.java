package staticExample;

public class staticBlock {
    static int a = 4;
    static int b ;
    static{
        System.out.println("I'm in static block");
        b=a*5;
    }
    public static void main(String[] args) {
        staticBlock obj = new staticBlock();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
