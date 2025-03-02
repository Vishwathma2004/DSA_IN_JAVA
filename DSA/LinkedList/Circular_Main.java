package LinkedList;

public class Circular_Main {
    public static void main(String[] args) {
        Circular list = new Circular();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.displayList();
        list.delete(3);
        list.displayList();
        list.delete(4);
        list.displayList();
    }
}
