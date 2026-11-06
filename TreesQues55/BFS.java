package TreesQues55;

import java.util.*;

class BST {
    private Node root;

    public static class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        public Node(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    public int getHeight(Node node) {
        if (node == null) {
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void display() {
        display(this.root, "Root Node: ");
    }

    private void display(Node node, String details) {
        if (node == null) {
            return;
        }

        System.out.println(details + node.getValue());

        display(node.left, "Left Child Of " + node.getValue() + ": ");
        display(node.right, "Right Child Of " + node.getValue() + ": ");
    }

    public void insert(int value) {
        this.root = insert(value, this.root);
    }

    private Node insert(int value, Node node) {
        if (node == null) {
            node = new Node(value);
            return node;
        }

        if (value < node.value) {
            node.left = insert(value, node.left);
        }

        if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

        return node;
    }

    public boolean isBalanced() {
        return isBalanced(this.root);
    }

    public boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && isBalanced(node.left)
                && isBalanced(node.right);
    }

    public void populate(int[] nums) {
        for (int num : nums) {
            insert(num);
        }
    }

    public void populatedSorted(int[] nums) {
        populatedSorted(nums, 0, nums.length - 1);
    }

    private void populatedSorted(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        int mid = start + (end - start) / 2;
        insert(nums[mid]);
        populatedSorted(nums, start, mid);
        populatedSorted(nums, mid + 1, end);
    }

    public void BFSearch() {
        System.out.print(root.value + " ");
        BFSearch(root, 1, root.height, root.height);
    }

    private void BFSearch(Node node, int level, int nodeHeight, int height) {
        if (node == null) {
            return;
        }

        if (level > height) {
            return;
        }

        if ((height - nodeHeight) == level) {
            System.out.print(node.value + " ");
            return;
        }

        BFSearch(node.left, level, node.height, height);
        BFSearch(node.right, level, node.height, height);

    }
}

public class BFS {
    public static void main(String[] args) {
        BST tree = new BST();
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        tree.populatedSorted(nums);
        tree.display();

        tree.BFSearch();
    }
}
