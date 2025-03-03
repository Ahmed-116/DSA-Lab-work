class Node1{
    int data;
    Node1 next;
    public Node1(int data){
        this.data = data;
        next = null;
    }
}
public class LLPractice {
    Node1 head;
    private void insertAtStart(int data){
        Node1 newNode = new Node1(data);
        if(head == null){
            head = newNode;
            return;
        }
        else{
           newNode.next = head;
           head = newNode;
           return;
        }
    }
    private void insertAtEnd(int data){
        Node1 newNode = new Node1(data);
        if(head == null){
            head = newNode;
            return;
        }
        else{
            Node1 temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
            return;
        }
    }
    private void insertAtIndex(int data, int index){
        Node1 newNode = new Node1(data);
        if(head == null){
            head = newNode;
        }
        else{
            Node1 temp = head;
            for(int i = 0; i < index-1 && temp.next!=null; i++){
                temp = temp.next;
            }
            if(temp == null){
                System.out.println("Index out of bounds");
                return;
            }
            else {
                newNode.next = temp.next;
                temp.next = newNode;
            }
        }
    }
    private void deleteAtFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
//        if(head.next == null){
//            head = null;
//        }//we donot need to do this bcz above check do the same job
        else{
            head = head.next;
            return;
        }
    }
    private void deleteAtLast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        if(head.next == null){
            head = null;
        }
        else{
            Node1 temp = head;
            while(temp.next.next != null){
                temp = temp.next;

            }
            temp.next = null;

        }
    }
    private void deleteAtIndex(int index){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        else if(head.next == null){
            head = null;
            return;
        }
        else{
            Node1 temp = head;
            for(int i = 0; i < index-1 && temp.next!=null; i++){
                temp = temp.next;

            }
            if(temp == null || temp.next == null){

                System.out.println("Index out of bounds");
            return;
            }
            else{
                temp.next = temp.next.next;

            }
        }
    }
    private void reverseList(){
        if(head == null){
            System.out.println("The list is empty");
        }
        else if(head.next == null){
            return;
        }
        Node1 prev = null;
        Node1 curr = head;
        Node1 next= null;
        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head.next=null;
        head = prev;

    }
    void printList(){
        if(head == null){
            System.out.println("The list is empty");
        }
        else{
            Node1 temp = head;
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp = temp.next;

            }
            System.out.println("NULL");
        }

    }

    public static void main(String[] args) {
        LLPractice obj = new LLPractice();
        obj.insertAtStart(1);
        obj.insertAtStart(2);
        obj.insertAtStart(3);
        obj.insertAtStart(4);
        obj.insertAtStart(5);
        obj.insertAtEnd(100);
        obj.printList();
        obj.reverseList();
        obj.printList();
        obj.deleteAtFirst();
        obj.printList();
        obj.deleteAtIndex(2);
        obj.printList();
        obj.insertAtIndex(3,2);
        obj.printList();
    }


}
