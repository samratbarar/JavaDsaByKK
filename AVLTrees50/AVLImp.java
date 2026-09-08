package AVLTrees50;

class AVL {
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

    public int getHeight() {
        return getHeight(root);
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
        } else if (value > node.value) {
            node.right = insert(value, node.right);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;

        return rotate(node);
    }

    private Node rotate(Node node) {
        if (getHeight(node.left) - getHeight(node.right) > 1) {
            if (getHeight(node.left.left) - getHeight(node.left.right) > 0) {
                return rightRotate(node);
            } 
            
            if (getHeight(node.left.left) - getHeight(node.left.right) < 0) {
                node.left = leftRotate(node.left);
                return rightRotate(node);
            }
        } 
        
        if (getHeight(node.left) - getHeight(node.right) < -1) {
            if (getHeight(node.right.left) - getHeight(node.right.right) < 0) {
                return leftRotate(node);
            } 
            
            if (getHeight(node.right.left) - getHeight(node.right.right) > 0) {
                node.right = rightRotate(node.right);
                return leftRotate(node);
            }
        }

        return node;
    }

    private Node leftRotate(Node node) {
        Node child = node.right;
        Node t = child.left;

        child.left = node;
        node.right = t;

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        child.height = Math.max(getHeight(child.left), getHeight(child.right)) + 1;

        return child;
    }
    
    private Node rightRotate(Node node) {
        Node child = node.left;
        Node t = child.right;

        child.right = node;
        node.left = t;

        node.height = Math.max(getHeight(node.left), getHeight(node.right)) + 1;
        child.height = Math.max(getHeight(child.left), getHeight(child.right)) + 1;

        return child;
    }

    public boolean isBalanced() {
        return isBalanced(this.root);
    }

    public boolean isBalanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(getHeight(node.left) - getHeight(node.right)) <= 1 && isBalanced(node.left) && isBalanced(node.right);
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
        if (start > end) {
            return;
        }

        int mid = start + (end - start) / 2;
        insert(nums[mid]);
        populatedSorted(nums, start, mid - 1); 
        populatedSorted(nums, mid + 1, end); 
    }
}

public class AVLImp {
    public static void main(String[] args) {
        AVL tree = new AVL();

        for (int i = 0; i < 1000; i++) {
            tree.insert(i);
        }

        System.out.println(tree.getHeight());
    }
}
