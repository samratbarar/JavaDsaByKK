package LinkedList44;

import java.util.*;

public class LL {

    private Node head;
    private Node tail;

    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }

        size++;
    }

    public void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void insertLast(int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }

        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int value, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertFirst(value);
            return;
        }

        if (index == size) {
            insertLast(value);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(value, temp.next);
        temp.next = node;

        size++;
    }

    // Insert using recursion
    // not a standard recursion approach
    // public void insertRec(int val, int index) {
    // insertRec(val, index, head);
    // }

    // public void insertRec(int val, int index, Node temp) {
    // if (index < 0 || index > size) {
    // throw new IndexOutOfBoundsException();
    // }

    // if (index == 0) {
    // insertFirst(val);
    // return;
    // }

    // if (index == size) {
    // insertLast(val);
    // return;
    // }

    // if (index == 1) {
    // Node node = new Node(val, temp.next);
    // temp.next = node;
    // size++;
    // return;
    // }

    // insertRec(val, index - 1, temp.next);
    // }

    public void insertRec(int val, int index) {
        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }

        head = insertRec(val, index, head);
        size++;
    }

    private Node insertRec(int val, int index, Node node) {
        if (index == 0) {
            Node newNode = new Node(val, node);
            return newNode;
        }

        node.next = insertRec(val, index - 1, node.next);
        return node;
    }

    public int deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        int val = head.value;
        head = head.next;

        if (head == null) {
            tail = null;
        }

        size--;
        return val;
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        Node node = head;

        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node;
    }

    public Node find(int value) {
        Node node = head;

        while (node != null) {
            if (node.value == value) {
                return node;
            }

            node = node.next;
        }

        return null;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.value;

        tail = get(size - 2);
        tail.next = null;

        size--;

        return val;
    }

    public int delete(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return deleteFirst();
        }

        if (index == size - 1) {
            return deleteLast();
        }

        Node prev = get(index - 1);

        int val = prev.next.value;

        prev.next = prev.next.next;

        size--;

        return val;
    }

    private void reverseRec(Node node) {
        if (node == tail) {
            head = tail;
            return; 
        }

        reverseRec(node.next);
        tail.next = node;
        tail = node;
        node.next = null;
    }

    private void reverse(Node node) {
        if (size < 2) {
            return;
        }
        
        Node prevNode = null;
        Node currNode = head;
        Node nextNode = head.next;

        while (currNode != null) {
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;

            if (nextNode != null) {
                nextNode = nextNode.next;
            }
        }

        head = prevNode;
    }
}