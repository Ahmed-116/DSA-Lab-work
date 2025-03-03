class Node2 {
    public int data;
    public Node2 next;

    Node2(int d) {
        data = d;
        next = null;
    }
}

public class CLL {
    Node head;

    private void insertAtStart(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        newNode.next = head;
        temp.next = newNode;
        head = newNode;
        return;
    }

    private void insertAtEnd(int d) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.next = head;

    }

    public void insertAt(int d, int indeX) {
        Node newNode = new Node(d);
        if (head == null) {
            head = newNode;
            newNode.next = head;
            return;

        }
        Node temp = head;
        for (int i = 0; i < indeX - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    private void deleteAtFirst() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        head = head.next;
        temp.next = head;

    }

    private void deleteAtEnd() {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        if (head.next == head) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;

        }
        temp.next = head;

    }

    private void deleteAt(int indeX) {
        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        for (int i = 0; i < indeX - 1 && temp.next != head; i++) {
            temp = temp.next;
        }
        if (temp.next == head) {
            head = null;
        }
        else {
            temp.next = temp.next.next;
        }

    }

    void printList() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }
        Node temp = head;
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(head)");
    }

    public static void main(String[] args) {
        CLL obj = new CLL();
        obj.insertAtStart(1);
        obj.insertAtStart(2);
        obj.insertAtStart(3);
        obj.insertAtEnd(4);
        obj.insertAtEnd(5);

        obj.insertAt(2,3);
        obj.printList();
        obj.deleteAt(2);
    obj.printList();
    obj.deleteAtEnd();
    obj.printList();
    }
}
