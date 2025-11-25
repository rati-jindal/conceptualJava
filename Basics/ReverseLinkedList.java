package Basics;

public class ReverseLinkedList {

    public class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public Node reverseList(Node head) {

        Node prev = null;
        Node current = head;

        while (current!=null){
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        return prev;
    }

    public static void main(String[] args) {

    }
}
