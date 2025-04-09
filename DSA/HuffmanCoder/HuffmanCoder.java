package HuffmanCoder;
import java.util.*;

public class HuffmanCoder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        Character data;
        int cost; // frequency
        Node left, right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            this.left = null;
            this.right = null;
        }

        @Override
        public int compareTo(Node other) {
            // For min-heap, compare based on cost (frequency)
            return this.cost - other.cost;
        }
    }

    // Constructor now takes a String input
    public HuffmanCoder(String feeder) throws Exception {
        HuffmanEncoder(feeder); // Call the HuffmanEncoder method to initialize the encoder/decoder maps
    }

    public void HuffmanEncoder(String feeder) throws Exception {
        HashMap<Character, Integer> fmap = new HashMap<>();
        for (int i = 0; i < feeder.length(); i++) {
            char cc = feeder.charAt(i);
            fmap.put(cc, fmap.getOrDefault(cc, 0) + 1);
        }

        // Use PriorityQueue instead of custom Heap
        PriorityQueue<Node> minHeap = new PriorityQueue<>();

        Set<Map.Entry<Character, Integer>> entrySet = fmap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.offer(node); // Insert node into the priority queue (min-heap)
        }

        while (minHeap.size() != 1) {
            Node first = minHeap.poll(); // Remove the smallest (min) node
            Node second = minHeap.poll(); // Remove the second smallest node

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.offer(newNode); // Insert the new node back into the priority queue
        }

        Node ft = minHeap.poll(); // full tree

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();
        this.initEncoderDecoder(ft, "");
    }

    private void initEncoderDecoder(Node node, String osf) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            this.encoder.put(node.data, osf);
            this.decoder.put(osf, node.data);
        }
        initEncoderDecoder(node.left, osf + "0");
        initEncoderDecoder(node.right, osf + "1");
    }

    public String encode(String source) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < source.length(); i++) {
            ans.append(encoder.get(source.charAt(i)));
        }
        return ans.toString();
    }

    public String decode(String code) {
        StringBuilder key = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < code.length(); i++) {
            key.append(code.charAt(i));
            if (decoder.containsKey(key.toString())) {
                ans.append(decoder.get(key.toString()));
                key.setLength(0); // Reset key
            }
        }
        return ans.toString();
    }

    public static void main(String[] args) throws Exception {
        String str = "abbccda";
        HuffmanCoder hf = new HuffmanCoder(str); // Now the constructor takes the string argument
        String cs = hf.encode(str);
        System.out.println(cs);
        String ds = hf.decode(cs);
        System.out.println(ds);
    }
}
