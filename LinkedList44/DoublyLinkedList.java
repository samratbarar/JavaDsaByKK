package LinkedList44;

import java.util.*;

class DLL {

    private Node head;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void display() {
        Node temp = head;
        Node last = null;

        while (temp != null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Print in reverse");
        while (last != null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }

        System.out.println("START");
    }

    public void insertLast(int value) {
        Node node = new Node(value);

        node.next = null;

        if (head == null) {
            head = node;
            node.prev = null;
            return;

        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
    }

    public void insert(int value, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            insertFirst(value);
            return;
        }

        Node temp = head;

        for (int i = 1; i < index; i++) {
            if (temp == null) {
                throw new IndexOutOfBoundsException();
            }

            temp = temp.next;
        }

        if (temp == null) {
            throw new IndexOutOfBoundsException();
        }

        Node node = new Node(value);
        node.next = temp.next;
        node.prev = temp;
        temp.next = node;

        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public void insertAfterNode(int prevNodeValue, int value) {
        Node prevNode = find(prevNodeValue);

        if (prevNode == null) {
            System.out.println("There is no such node present in linked list");
            return;
        }

        Node node = new Node(value);
        node.next = prevNode.next;
        node.prev = prevNode;
        prevNode.next = node;

        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public int deleteFirst() {
        if (head == null) {
            throw new NoSuchElementException();
        }

        int val = head.value;
        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return val;
    }

    public Node get(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        Node node = head;

        for (int i = 0; i < index; i++) {
            if (node == null) {
                throw new IndexOutOfBoundsException();
            }
            node = node.next;
        }

        if (node == null) {
            throw new IndexOutOfBoundsException();
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
        if (head == null) {
            throw new NoSuchElementException();
        }

        if (head.next == null) {
            return deleteFirst();
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        int val = temp.value;
        temp.prev.next = null;
        temp.prev = null;

        return val;
    }

    public int delete(int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            return deleteFirst();
        }

        Node prev = get(index - 1);
        Node deleted = prev.next;

        prev.next = deleted.next;

        if (deleted.next != null) {
            deleted.next.prev = prev; 
        }

        deleted.next = null;
        deleted.prev = null;

        return deleted.value;
    }
}

public class DoublyLinkedList {
    public static void main(String[] args) {

    }
}
