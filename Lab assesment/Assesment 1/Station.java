public class Station {
    Node head;
    public void addStationAtStart(String name,int distance){
        Node newNode=new Node(name, distance);
        if (head == null) {
            head=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
        return;
    }
    public void insertStationAtLast(String name,int distance){
        Node newNode=new Node(name, distance);
        if (head == null) {
            head=newNode;
            return;
        }
            Node temp=head;
            while (temp.next != null) {
                temp=temp.next;
            }
            temp.next=newNode;
            newNode.prev=temp;
            return;

    }
//    public void insertAtSpecificPosition(String name,int distance,int
//            position){
//
//        Node newNode=new Node(name, distance);
//        if(position<0){
//            System.out.println("Invalid Position");
//            return;
//        }
//        if (head == null || position==0) {
//            head=newNode;
//            return;
//        }
//        Node temp=head;
//        for(int i=0;i<position - 1 && temp.next!=null;i++){
//            temp=temp.next;
//        }
//        newNode.next=temp.next;
//        newNode.prev=temp;
//        temp.next.prev=newNode;
//        temp.next=newNode;
//        return;
//    }
public void insertAtSpecificPosition(String name, int distance, int position) {
    Node newNode = new Node(name, distance);

    if (position < 0) {
        System.out.println("Invalid Position");
        return;
    }

    // Insert at the beginning
    if (position == 0) {
        newNode.next = head;
        if (head != null) {
            head.prev = newNode;
        }
        head = newNode;
        return;
    }

    Node temp = head;

    // Traverse to the node before the target position
    for (int i = 0; i < position - 1 && temp != null; i++) {
        temp = temp.next;
    }

    // If position is out of bounds
    if (temp == null) {
        System.out.println("Index out of bound");
        return;
    }

    // Insert the node
    newNode.next = temp.next;
    newNode.prev = temp;

    if (temp.next != null) {
        temp.next.prev = newNode;  // Ensure the next node correctly references newNode
    }

    temp.next = newNode;
}

    public void removeFirstStart(){
        if (head == null) {
            System.out.println("Cannot remove");
            return;
        }
        else{
            head=head.next;
            head.prev=null;
        }
    }
    public void removeLastStation(){
        if (head == null) {
            System.out.println("Cannot remove");
            return;
        }
        if (head.next == null) {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return;
    }
    public void removeSpecificStation(int position) {
        if (head == null || position < 0) {
            System.out.println("Cannot remove");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }
        Node temp = head;

        for (int i = 0; i < position - 1 && temp.next != null;i++) {
            temp = temp.next;
        }
        if(temp.next==null){
            System.out.println("Index out of bound");
            return;
        }
        temp.next.next=temp.next;
        temp.next.prev=temp;
        return;
    }
    public void displayRoute(){
        Node temp=head;
        while (temp!=null){
            System.out.println(temp.name+"->("+temp.distance+"km)");

            temp=temp.next;
        }
        System.out.println("_______________________________________");
    }

}
