
public class Package {
    public static void main(String[] args) {
        A obj = new A("Abc");
        System.out.println(obj);
    }
}
class A{
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
    }
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
