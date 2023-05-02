public class Node {

    private Node next = null;

    private int key = 0;

    public Node(Node next, int key){
        this.next = next;
        this.key = key;

    }

    public Node getNext(){
        return this.next;
    }

    public int getKey(){
        return this.key;
    }


}
