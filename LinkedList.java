public class LinkedList {

    private Node head = new Node(null, 0);

    public Node getHead() {
        return head;
    }

    public boolean isEmpty(){
        if (head.getNext() == null){
            return true;
        }

        return false;
    }

    public LinkedList add(int value){
        Node node = new Node(null, value);
        if (this.isEmpty()){
            this.head = node;

        }
        else {
            Node finalspot = this.head;
            while (finalspot.getNext() != null){
                finalspot = finalspot.getNext();
            }
            finalspot.setNext(node);

        }
        return this;
    }



}
