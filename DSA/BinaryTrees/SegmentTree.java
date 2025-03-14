package BinaryTrees;

public class SegmentTree {
    private static class Node{
        int value;
        int start;
        int end;
        Node left;
        Node right;
        public Node(int start,int end){
            this.start = start;
            this.end = end;
            
        }
    }
    Node root;
    public SegmentTree(int[] arr){
        //create a tree using array
        this.root = constructTree(arr,0,arr.length-1);
    }
    private Node constructTree(int[] arr,int start,int end){
        if(start == end){
            //we are at leaf node
            Node leaf = new Node(start, end);
            leaf.value = arr[start];
            return leaf;
        }
        //create node with index you are at
        Node node = new Node(start, end);
        int mid = start+(end-start)/2;
        node.left = this.constructTree(arr, start, mid);
        node.right = this.constructTree(arr, mid+1, end);
        node.value = node.left.value + node.right.value;
        return node;    
    }
    public void display(){
        display(this.root);
    }
    private void display(Node node){
        String str = "";
        if(node.left!=null){
            str = str+"Interval = ["+node.left.start+","+node.left.end+"] and value : "+node.left.value+" -> ";
        }
        else{
            str = str+"No left Child";
        }
        //for current node
        str = str+"Interval = ["+node.start+","+node.end+"] and value : "+node.value+" <- ";
        if(node.right!=null){
            str = str+"Interval = ["+node.right.start+","+node.right.end+"] and value : "+node.right.value;
        }
        else{
            str = str+"No Right Child";
        }
        System.out.println(str);

        //call recursion
        if(node.left!=null){
            display(node.left);
        }
        if(node.right!=null){
            display(node.right);
        }
    }
    //query 
    public int query(int qsi,int qei){
        return this.query(this.root,qsi, qei);
    }
    private int query(Node node,int qsi,int qei){
        if(node.start>=qsi && node.end<=qei){
            //node is completely lying inside the query
            return node.value;
        }
        else if(node.start>qei || node.end<qei){
            return 0;
        }
        else{
            return this.query(node.left,qsi, qei)+this.query(node.right,qsi, qei);
        }
    }

    //update the node value
    public void update(int index,int value){
        this.root.value = this.update(this.root,index, value);
    }
    private int update(Node node,int index,int value){
        if(index>=node.start && index<=node.end){
            if(index == node.start && index == node.end ){
                node.value = value;
                return node.value;
            }
            else{
                int leftAns = update(node.left,index, value);
                int rightAns = update(node.right,index, value);
                node.value = leftAns + rightAns;
                return node.value;
            }
        }
        return node.value;
    }
    public static void main(String[] args) {
        int[] arr = {3,8,6,7,-2,-8,4,9};
        SegmentTree tree = new SegmentTree(arr);
        tree.constructTree(arr, 0, arr.length-1);
        tree.display();
        
    }
}
