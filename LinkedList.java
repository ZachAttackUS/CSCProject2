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
            this.head.setNext(node);

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
