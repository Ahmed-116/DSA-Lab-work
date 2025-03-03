class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DoubleLL {
    Node head;

    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }

    public void insertAfter(int data, int key) {
        Node newNode = new Node(data);
        Node currentNode = head;
        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Key not found in the list");
        } else {
            newNode.next = currentNode.next;
            newNode.prev = currentNode;
            if (currentNode.next != null) {
                currentNode.next.prev = newNode;
            }
            currentNode.next = newNode;
        }
    }

    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is empty");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        }
    }

    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty");
        } else if (head.next == null) {
            head = null;
        } else {
            Node temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
        }
    }

    public void deleteByKey(int key) {
        Node currentNode = head;
        while (currentNode != null && currentNode.data != key) {
            currentNode = currentNode.next;
        }
        if (currentNode == null) {
            System.out.println("Key not found in the list");
        } else if (currentNode == head) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
        } else {
            currentNode.prev.next = currentNode.next;
            if (currentNode.next != null) {
                currentNode.next.prev = currentNode.prev;
            }
        }
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.insertAtBeginning(10);
        dll.insertAtBeginning(20);
        dll.insertAtBeginning(30);
        dll.insertAtEnd(40);
        dll.insertAtEnd(50);
        dll.insertAfter(60, 30);
        System.out.println("Original List:");
        dll.printList();

        dll.deleteAtBeginning();
        System.out.println("List after deleting at beginning:");
        dll.printList();

        dll.deleteAtEnd();
        System.out.println("List after deleting at end:");
        dll.printList();

        dll.deleteByKey(20);
        System.out.println("List after deleting by key 20:");
        dll.printList();
    }
}
