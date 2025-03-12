public class Node
{
    String name;
    int distance;
    Node next;
    Node prev;
    public Node(String name,int distance) {
        this.name = name;
        this.distance=distance;
        this.next=null;
        this.prev=null;
    }
}