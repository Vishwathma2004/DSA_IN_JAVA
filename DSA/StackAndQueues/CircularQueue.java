package StackAndQueues;

public class CircularQueue {
    protected int front = 0;
    protected int end = 0;
    private int size = 0;
    private int[] data;
    private static final int DEFAULT_SIZE = 10;

    public CircularQueue() {
        this(DEFAULT_SIZE);
    }

    public CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean isFull() {
        return size == data.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;  // Insert at 'end'
        end = (end + 1) % data.length;  // Move 'end' circularly
        size++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty");
        }
        int removed = data[front];  // Get front element
        front = (front + 1) % data.length;  // Move 'front' circularly
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is Empty");
        }
        return data[front];  // Correctly return the front element
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Empty");
            return;
        }
        int i = front;
        int count = 0;  // To prevent infinite loop
        do {
            System.out.print(data[i] + " ");
            i = (i + 1) % data.length;
            count++;
        } while (count < size);  // Loop only through valid elements
        System.out.println("END");
    }

    public static void main(String[] args) {
        CircularQueue circle = new CircularQueue(6);
        circle.insert(0);
        circle.insert(1);
        circle.insert(2);
        circle.insert(3);
        circle.insert(4);
        circle.insert(5);

        circle.display();  

        try {
            System.out.println("Removed: " + circle.remove());  
            System.out.println("Front: " + circle.front());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        circle.display(); 
    }
}
