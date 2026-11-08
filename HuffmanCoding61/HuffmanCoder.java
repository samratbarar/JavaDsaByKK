package HuffmanCoding61;

import java.util.*;

import Heaps56.HeapImp;

public class HuffmanCoder {
    HashMap<Character, String> encoder;
    HashMap<String, Character> decoder;

    private class Node implements Comparable<Node> {
        Character data;
        int cost;
        Node left;
        Node right;

        public Node(Character data, int cost) {
            this.data = data;
            this.cost = cost;
            left = null;
            right = null;
        }

        @Override
        public int compareTo(Node other) {
            return Integer.compare(this.cost, other.cost);
        }
    }

    public HuffmanCoder(String feeder) throws Exception {
        if (feeder.length() < 1) {
            throw new Exception("Feeder string is empty");
        }

        HashMap<Character, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < feeder.length(); i++) {
            char ch = feeder.charAt(i);
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        HeapImp<Node> minHeap = new HeapImp<>();
        Set<Map.Entry<Character, Integer>> entrySet = freqMap.entrySet();

        for (Map.Entry<Character, Integer> entry : entrySet) {
            Node node = new Node(entry.getKey(), entry.getValue());
            minHeap.insert(node);
        }

        while (minHeap.size() != 1) {
            Node first = minHeap.remove();
            Node second = minHeap.remove();

            Node newNode = new Node('\0', first.cost + second.cost);
            newNode.left = first;
            newNode.right = second;

            minHeap.insert(newNode);
        }

        Node ft = minHeap.remove();

        this.encoder = new HashMap<>();
        this.decoder = new HashMap<>();

        this.initEncoderDecoder(ft, "");
    }

    private void initEncoderDecoder(Node node, String output) {
        if(node == null) {
            return;
        }

        if (node.left == null && node.right == null) {
            if (output.length() < 1) {
                output += "0";
            }
            encoder.put(node.data, output);
            decoder.put(output, node.data);
            return;
        }

        initEncoderDecoder(node.left, output + "0");
        initEncoderDecoder(node.right, output + "1");
    }

    public String encode(String source) {
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < source.length(); i++) {
            char ch = source.charAt(i);

            ans.append(encoder.get(ch));
        }

        return ans.toString();
    }
    
    public String decode(String codedString) {
        StringBuilder ans = new StringBuilder();
        StringBuilder key = new StringBuilder();

        for (int i = 0; i < codedString.length(); i++) {
            key.append(codedString.charAt(i));
            String k = key.toString();
            
            if (decoder.containsKey(k)) {
                ans.append(decoder.get(k));   
                key.setLength(0);             
            }
        }

        return ans.toString();
    }

    public static void main(String[] args) throws Exception {
        HuffmanCoder hf = new HuffmanCoder("abbccda");
        String code = hf.encode("abbccda");
        System.out.println(code);
        System.out.println(hf.decode(code));
    }
}
