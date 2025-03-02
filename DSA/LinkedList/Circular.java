package LinkedList;

public class Circular {
    private Node head;
    private Node tail;
    public Circular(){
        this.head = null;
        this.tail = null;
    }
    class Node{
        int val;
        Node next;
        public Node(int val){
            this.val = val;
        }
        public Node(int val,Node next){
            this.val = val;
            this.next = next;

        }
    }
    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }
    public void displayList(){
        Node temp = head;
        if(head!=null){
            do{
                System.out.print(temp.val+"->");
                temp = temp.next;
            }while(temp!=head);
        }
        System.out.println("END");
    }
    public void delete(int val){
        Node node = head; 
        if(node==null){
            return;
        }
        if(node.val==val){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.val ==val){
                node.next = n.next;
                break;
            }
            node = node.next;
        }
        while(node!=head);
    }
}
