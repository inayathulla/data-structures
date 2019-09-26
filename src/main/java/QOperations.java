public class QOperations {
    public static void main(String[] args) {
        ArrayDequeue arrayDequeue = new ArrayDequeue(5);
        arrayDequeue.enqueue(10);
        arrayDequeue.enqueue(20);
        arrayDequeue.enqueue(30);
        arrayDequeue.enqueue(40);
        arrayDequeue.enqueue(50);
        System.out.println(arrayDequeue);

        arrayDequeue.dequeue();
        arrayDequeue.dequeue();
        arrayDequeue.dequeue();
        arrayDequeue.dequeue();
        arrayDequeue.dequeue();
        //arrayDequeue.dequeue();

        arrayDequeue.enqueue(60);

        arrayDequeue.dequeue();

        arrayDequeue.enqueue(70);
        System.out.println(arrayDequeue);
    }
}
