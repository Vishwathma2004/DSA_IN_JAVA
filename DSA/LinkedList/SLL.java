package LinkedList;

public class SLL {
    private Node head;
    private Node tail;
    private int size;
    public SLL(){
        this.size = 0;
    }
    private class Node{
        private int val;
        private Node next;
        public Node(int val,Node next){
            this.val = val;
            this.next = next;
        }
        public Node(int val){
            this.val = val;
        }
    }

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
    
        if(tail==null){
            tail = head;
        }
        size+=1;
    }

    public void insertEnd(int val){
        if(tail==null){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }
    public void insertPosition(int val,int index){
        if(index ==0){
            insertFirst(val);
            return;
        }
        if(index ==size){
            insertEnd(val);
            return;
        }
        Node temp = head;
        for(int i=1;i< index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;
        size++;
    }
    public void displayList(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public int deleteFirst(){
        int value = head.val;
        head = head.next;
        if(head==null){
            tail = null;
        }
        size--;
        return value;
    }   
    //insert using recursion
    public void insertRec(int val,int index){
        head = insertRec(val, index, head);   
    }
    private Node insertRec(int val,int index,Node node){
        if(index == 0){
            Node temp = new Node(val , node);
            size++;
            return temp;
        }
        node.next = insertRec(val, index-1, node.next);
        return node;  
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = tail.val;
        tail = secondLast;
        tail.next = null;
        return val;
    }
    public int deletePosition(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index ==size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.val;
        prev.next = prev.next.next;
        return val;
    }
    public Node find(int val){
        Node node = head;
        while (node!=null) {
            if(node.val == val){
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index){
        Node node = head;
        for(int i=0;i<index;i++){
            node = node.next;
        }
        return node;
    }
}

