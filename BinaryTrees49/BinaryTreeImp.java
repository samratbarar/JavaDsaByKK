package BinaryTrees49;

import java.util.*;

class BT {
    private Node root;

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the root Node: ");
        root = new Node(sc.nextInt());
        populate(sc, root);
    }

    private void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            node.left = new Node(sc.nextInt());
            populate(sc, node.left);        
        } 

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            node.right = new Node(sc.nextInt());
            populate(sc, node.right); 
        }
    }

    // display elements
    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");
    }

    public void prettyDisplay() {
        prettyDisplay(root, 0);
    }

    private void prettyDisplay(Node node, int level) {
        if (node == null) {
            return;
        }

        prettyDisplay(node.right, level + 1);

        if (level != 0) {
            for (int i = 0; i < level-1; i++) {
                System.out.print("|\t");
            }
            System.out.println("|------->" + node.value);
        } else {
            System.out.println(node.value);
        }

        prettyDisplay(node.left, level + 1);
    }
}

public class BinaryTreeImp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BT tree = new BT();
        tree.populate(sc);
        // tree.display();
        tree.prettyDisplay();

        sc.close();
    }
}
