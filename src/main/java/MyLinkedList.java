import java.util.List;

public class MyLinkedList{

    class Node{
        int value;
        Node next;

        public Node(int value){
            this.value = value;
        }
    }

    private Node first = null;
    private Node last = null;

    public Node add(int value){
        Node node = new Node(value);
        if(first == null){
            first = node;
            last = node;
        }else{
            last.next = node;
            last = node;
        }
        return last;
    }

    /**
     * This method will print Kth element from last
     * @return
     */
    public void KthLastElement(int k){
        Node current = first;
        int i= 0;

        while(current != null && i< k){
            current = current.next;
            i++;
        }
        if(current == null){
            System.out.println("Element is beyond range");
        }
        else{
            Node Kth = first;
            while(current != null){
                current = current.next;
                Kth = Kth.next;
            }
            System.out.println(k +" from last : "+Kth.value);
        }
    }

    /**
     * Detect if loop is present
     * @return
     */
    public boolean hasLoop(){

        Node slow = first;
        Node fast = first;

        while(fast != null && fast.next !=null) {
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast) return true;
        }
        return false;
    }
    // To find mid element in list
    public void midElement(){
        if(hasLoop()){
            System.out.println("There is loop in list, can't determine mid value");
        }else{
            Node slow = first;
            Node fast = first;

            while(fast != null && fast.next !=null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            System.out.println("Mid element is : "+ slow.value);
        }
    }

    public String toString(){
        StringBuilder sb = new StringBuilder(" ");

        Node current = first;
        while(current !=null){
            sb = sb.append(" ").append(current.value);
            current = current.next;
        }
        return sb.toString();
    }
}