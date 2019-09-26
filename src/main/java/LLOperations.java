import java.util.ArrayList;
import java.util.List;

public class LLOperations {
    public static void main(String[] args) {
        MyLinkedList lst = new MyLinkedList();
        MyLinkedList loopList = new MyLinkedList();

        lst.add(10);
        lst.add(20);
        lst.add(30);
        lst.add(40);
        lst.add(50);
        System.out.println("List elements : "+lst);

        //Finding kth element from last
        lst.KthLastElement(2);

        //To find whether loop exists or not
        loopList.add(10);
        MyLinkedList.Node node1 = loopList.add(20);
        loopList.add(30);
        MyLinkedList.Node node2 = loopList.add(40);
        node2.next = node1;
        // 10 -> 20 -> 30 -> 40
        //        ^          |
        //        |----------
        System.out.println("Does list has loop ? "+loopList.hasLoop());

        //Finding middle element in the list
        lst.midElement();

    }
}
