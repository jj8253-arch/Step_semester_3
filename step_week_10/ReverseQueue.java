package step_week_10;

public class ReverseQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    static Node reverse(Node head) {
        Node previous = null;
        Node current = head;

        while (current != null) {
            Node nextNode = current.next;

            current.next = previous;
            previous = current;
            current = nextNode;
        }

        return previous;
    }

    static void display(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.data);

            if (current.next != null) {
                System.out.print(" -> ");
            }

            current = current.next;
        }

        System.out.println(" -> null");
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = reverse(head);
        display(head);

        Node single = new Node(9);
        single = reverse(single);
        display(single);
    }
}
