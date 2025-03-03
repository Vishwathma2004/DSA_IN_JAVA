package LinkedList;

public class Main {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertEnd(0);
        list.insertPosition(7, 0);
        list.insertPosition(6,1);
        list.insertPosition(5,2);
        list.displayList();
        System.out.println(list.deleteFirst());
        list.deleteLast();
        list.displayList();
        list.deletePosition(2);
        list.displayList();
        list.find(5);
        list.displayList();
        list.insertRec(5, 5);
        list.displayList();
    }
}
