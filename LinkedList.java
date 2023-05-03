public class LinkedList {

    private Node head = new Node(null, 0);

    public Node getHead() {
        return head;
    }

    //returns the length of the list
    public int size(){
        int length = 0;
        while (this.head.getNext() != null){
            this.head = this.head.getNext();
            length++;
        }
        return length;
    }



    //returns true if list is empty, meaning head.getNext() == null
    public boolean isEmpty(){
        if (head.getNext() == null){
            return true;
        }

        return false;
    }

    //adds a new node with the inputted value
    //if list is empty meaning head.getNext() == null then head.next is set to new node
    /*if list not empty, uses while loop to traverse list be continuously checking next value for a null.
    Once a null is found for the next node, the node current is set to the new node for its next value
     */
    public void add(int value){
        Node node = new Node(null, value);
        if (this.isEmpty()){
            this.head.setNext(node);

        }
        else {
            Node finalspot = this.head;
            while (finalspot.getNext() != null){
                finalspot = finalspot.getNext();
            }
            finalspot.setNext(node);

        }
    }

    public LinkedList reverseAndAdd(String num){
        char[] charArray = num.toCharArray();
        for (int i = charArray.length - 1; i >= 0; i--){
            int digit = Character.getNumericValue(charArray[i]);
            this.add(digit);
        }
        System.out.println(this.getHead().getKey());
        return this;
    }




}
