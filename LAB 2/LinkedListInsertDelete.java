class Node{
    int data;
    Node next;
    Node(int d){
        data = d;
        next = null;
    }
}
public class LinkedListInsertDelete {
    Node head;

    public void insertAtFirst(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }
    public void insertAtLast(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
      Node last = head;
        while(last.next != null){
            last = last.next;
        }
        last.next = newNode;

    }
    public void insertAtPosition(int index, int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node current = head;
        for(int i = 0; i < index && current!=null; i++){
            current = current.next;

        }
        if(current == null){
            System.out.println("Index out of bounds");
        }
        else{
            newNode.next = current.next;
            current.next = newNode;

        }
    }
    void deleteAtFirst(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        return;
    }
    void deleteAtLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        while(head.next.next != null){
            head = head.next;

        }
        head.next = null;
        return;
    }
    void deleteAtPosition(int index){
        if(head == null){
            System.out.println("List is empty");
        }
        if(index == 0){
            head = head.next;
            return;
        }
        Node temp = head;
       for(int i = 0; i < index -1 && temp!=null; i++){
           temp = temp.next;

       }
       if(temp == null||temp.next == null){
           System.out.println("Invalid index");
       }
       temp.next = temp.next.next;
       return;
    }
    void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"-->");
            temp = temp.next;
        }
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
    }

}