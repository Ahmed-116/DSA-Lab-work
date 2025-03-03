class Node1 {
    int data;
    Node1 next;
    Node1 prev;

    public Node1(int data) {
        this.data = data;
        next = null;
        prev = null;
    }
}

public class DoubleLLPractice {
    Node1 head;
    private void insertAtFirst(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return;
    }
    private void insertAtLast(int data) {
        Node1 newNode = new Node1(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node1 temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
        newNode.prev = temp;
        return;


    }
    private void insertAtIndex(int data, int index) {
        Node1 newNode = new Node1(data);
        if (index == 0) {
            insertAtFirst(data);
            return;
        }
        if(head == null) {
            insertAtFirst(data);
            return;
        }
        Node1 temp = head;
        for (int i = 0; i < index - 1 && temp!=null; i++) {
            temp = temp.next;

        }
        if (temp == null) {
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next = temp.next;
        temp.next.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
        return;
    }
    private void deleteFirst() {
        if (head == null) {
            return;
        }
        head = head.next;
        if(head != null) {
            head.prev = null;
        }
        return;
    }
    private void deleteLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
        }
        Node1 temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

        return;
    }
    private void deleteIndex(int index) {
        if(head == null) {
            return;
        }
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index < 0) {
            System.out.println("Invalid index");
            return;
        }
        Node1 temp = head;
        for (int i = 0; i < index-1 && temp!=null; i++) {
            temp = temp.next;
        }
        if (temp== null||temp.next == null||temp.next.next == null) {
            System.out.println("Index out of bounds");
            return;
        }
        else {

            temp.next.next.prev = temp;
            temp.next.next = temp.next;



        }

    }

    public void printList() {
        Node1 temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
}
