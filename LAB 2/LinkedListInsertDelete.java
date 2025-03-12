class Node {

    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;

    }
}

public class LinkedListInsertDelete {
    public int size;
    Node head;

    LinkedListInsertDelete() {
        size = 0;
    }

    public void insertAtFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void insertAtLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;
        size++;

    }

    public void insertAtPosition(int index, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 0; i < index && current != null; i++) {
            current = current.next;

        }
        if (current == null) {
            System.out.println("Index out of bounds");
        } else {
            newNode.next = current.next;
            current.next = newNode;

        }
        size++;
    }

    void deleteAtFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
        size--;


    }

    void deleteAtLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;

        }
        temp.next = null;
        size--;

    }

    //    void deleteAtLast(){
//        if(head == null){
//            System.out.println("List is empty");
//        }
//        else if(head.next == null){
//                head = null;
//
//        }
//      else {
//          while(head.next.next != null){
//              head = head.next;
//          }
//          head.next = null;
//
//        }
//      return;
//
//    }
    void deleteAtPosition(int index) {
        if (head == null) {
            System.out.println("List is empty");
        }
        size--;
        if (index == 0) {
            head = head.next;
            return;
        }
        Node temp = head;
        for (int i = 0; i < index - 1 && temp != null; i++) {
            temp = temp.next;

        }
        if (temp == null || temp.next == null) {
            System.out.println("Invalid index");
        }
        temp.next = temp.next.next;
        size--;

    }

    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "-->");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public int getSize() {
        return size;
    }

    void reverseList() {
        if (head == null || head.next == null) {
            return;
        }
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            //update
            prev = current;
            current = next;
        }
        head.next = null;
        head = prev;

    }


    public static void main(String[] args) {
        LinkedListInsertDelete list = new LinkedListInsertDelete();

        list.insertAtFirst(1);
        list.insertAtFirst(2);
        list.insertAtLast(3);
        list.insertAtLast(4);
        list.insertAtLast(5);
        list.insertAtLast(6);
        list.insertAtPosition(3, 99);
        list.printList();
        list.deleteAtPosition(2);
        System.out.println();
        list.printList();
        list.deleteAtLast();
        System.out.println();
        list.printList();
        System.out.println();
        System.out.println(list.getSize());
        list.reverseList();
        System.out.println("Reversed List: ");
        list.printList();

    }

}




