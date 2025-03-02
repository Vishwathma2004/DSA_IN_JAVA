package LinkedList;

public class DLL {
    private Node head;
    class Node{
        int val;
        Node next;
        Node prev;
        public Node(int val,Node next,Node prev){
            this.val = val ;
            this.next = next;
            this.prev = prev;
        }
        public Node(int val){
            this.val = val;
        }

    }
    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;  
        } else {
            node.next = head;  
            head.prev = node;  
            head = node;       
        }
    }
    
    public void displayList(){
        Node temp = head;
        Node last = null;
        while (temp!=null) {
            System.out.print(temp.val+"->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Print in reverse");
        while(last!=null){
            System.out.print(last.val+"->");
            last = last.prev;
        }
        System.out.println("START");
    }
    public void insertEnd(int val){
        Node node = new Node(val);
        if(head ==null){
            node.prev = null;
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
    }
    public void insertAfter(int afterValue,int val){
        Node p = find(afterValue);
        if(p ==null){
            System.out.println("Node not exists");
            return;
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        if(node.next!=null){
        node.next.prev = node;}
    }
    public Node find(int val){
        Node node = head;
        while(node!=null){
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
}
