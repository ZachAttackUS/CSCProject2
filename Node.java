public class Node {

    private Node next = null;

    private int key = 0;

    public Node(Node next, int key){
        this.setNext(next);
        this.key = key;

    }

    public Node getNext(){
        return this.next;
    }

    public int getKey(){
        return this.key;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
