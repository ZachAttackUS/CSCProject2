public class LinkedList {

    private Node head = new Node(null, 0);


    public boolean isEmpty(){
        if (head.getNext() == null){
            return true;
        }

        return false;
    }

}
