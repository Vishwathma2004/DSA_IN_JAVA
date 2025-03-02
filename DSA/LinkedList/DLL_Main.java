package LinkedList;

public class DLL_Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(4);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertEnd(5);
        list.insertAfter(5, 6);
        list.displayList();

    }
}
