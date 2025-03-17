package StringBuffer;
public class Main {
    public static void main(String args[]){
        //constructor 1
        StringBuffer buf1 = new StringBuffer();
        buf1.append("is Nice!!");
        String str = buf1.toString();
        System.out.println(buf1);
        System.out.println(str);
        //constructor 2
        StringBuffer buf2 = new StringBuffer("Hello World");
        buf2.insert(6, "Rahul ");
        System.out.println(buf2);
        //constructor 3        
        StringBuffer buf3 = new StringBuffer(30);
        buf3.append("Hallo");
        buf3.replace(1, 2, str);
        System.out.println(buf3);


        //to check capacity of StringBuffer
        System.out.println("Capacity of String is "+buf1.capacity());
    }
}
