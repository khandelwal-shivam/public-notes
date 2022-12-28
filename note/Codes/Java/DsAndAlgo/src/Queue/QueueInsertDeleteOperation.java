package Queue;

public class QueueInsertDeleteOperation {

    public class ListNode{
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void enqueue(int data) {
        ListNode newNode = new ListNode(data);
        if(front == null) {
            rear = newNode;
            front = newNode;
        } else {
            front.next = newNode;
            front = newNode;
        }
    }

    public void dequeue() {
//        ListNode deletedNode = rear;
        System.out.println("deleted node from queue is "+rear.data);
        rear = rear.next;

    }
    private ListNode front; // insertion happens here
    private ListNode rear; // deletion happens here.

    // in ideal world insertion happens read end and deletion happens at front
    public void printQueue() {
        // Will print the latest node at the end
        if(rear == null) return;
        ListNode current = rear;
        while(current != null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public QueueInsertDeleteOperation() {
        front = null;
        rear = null;
    }

    public static void main(String[] args) {
        QueueInsertDeleteOperation qido = new QueueInsertDeleteOperation();
        qido.enqueue(10);
        qido.enqueue(20);
        qido.enqueue(30);
        qido.enqueue(40);
        qido.enqueue(50);
        qido.enqueue(60);
        qido.enqueue(70);
        qido.printQueue();
        qido.dequeue();
        qido.printQueue();
        qido.dequeue();
        qido.printQueue();
    }
}
