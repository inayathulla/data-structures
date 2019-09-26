import java.util.Arrays;

public class ArrayDequeue {

    int[] items;
    int count;
    int rear;
    int front;

    public ArrayDequeue(int capacity) {
        items = new int[capacity];
    }

    /**
     * In Circular Array of size 5 elements will be inserted in below order
     * items.length == 5, after filling all items in first round,
     * 5th/10th .. element should be at index 0 again (Item starts at 0, not 1)
     * Item -> Index
     * 0 -> 0, 1 -> 1, 2 -> 2, 3 -> 3, 4 -> 4
     * 5 -> 0, 6 -> 1, 7 -> 2, 8 -> 3, 9 -> 4
     * 10 -> 0, 11 -> 1, 12 -> 2, 13 -> 3, 14 -> 4
     * As index is represented with rear, rear++ won't work, rather
     * rear = (rear+1) % items.length
     */

    public void enqueue(int item){
        if(count == items.length) throw new IllegalStateException();
        items[rear] = item;
        rear = (rear+1)%items.length;
        count ++;
    }

    public int dequeue(){
        if(count == 0) throw new IllegalStateException();

        int item = items[front];
        items[front] = 0; // clearing item
        front = (front+1)%items.length;
        count --;
        return item;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}
