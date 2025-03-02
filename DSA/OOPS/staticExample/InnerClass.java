
public class InnerClass {//outside classes cannot be static
    static class Test{//inner class can be static 
        String name;
        public Test(String name){
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Abc");
        System.out.println(a.name);
    }
}