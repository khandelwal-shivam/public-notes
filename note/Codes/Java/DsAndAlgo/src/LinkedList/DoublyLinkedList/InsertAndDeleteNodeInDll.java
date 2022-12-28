package LinkedList.DoublyLinkedList;

public class InsertAndDeleteNodeInDll {
    public class ListNode {
        private int data;
        private ListNode next;
        private ListNode previous;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
            this.previous = null;
        }
    }
    private ListNode head;
    private ListNode tail;
    private int length;

    public InsertAndDeleteNodeInDll() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    private int getLength() {
        return length;
    }
    public boolean isEmpty() {
        return length == 0;
    }
    public void printDllForward() {
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }

    public void printDllBackward() {
        ListNode current = tail;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.previous;
        }
        System.out.println("null");
    }

    public void insertAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if(isEmpty()) {
            tail = newNode;
        } else {
            newNode.next = head;
            head.previous = newNode;
        }
        head = newNode;
        length++;
    }

    public void insertAtEnd(int data){
        ListNode newNode = new ListNode(data);
        if(isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
            newNode.previous = tail;
        }
        tail = newNode;
        length++;
    }

    public void deleteFirstNode() {
        if(isEmpty()) return;
        System.out.println("Deleted node is "+head.data);
        head = head.next;
        head.previous = null;
        length--;
    }

    public void deleteLastNode() {
        if(isEmpty()) return;
        System.out.println("Deleted Node is "+tail.data);
        tail = tail.previous;
        tail.next = null;
        length--;
    }

    public static void main(String[] args) {
        InsertAndDeleteNodeInDll indll = new InsertAndDeleteNodeInDll();
        indll.insertAtBeginning(5);
        indll.insertAtBeginning(10);
        indll.insertAtBeginning(15);
        indll.insertAtEnd(20);
        indll.insertAtEnd(25);
        indll.insertAtEnd(30);
        indll.insertAtEnd(35);
        indll.printDllForward();
        indll.printDllBackward();
        indll.deleteFirstNode();
        indll.deleteLastNode();
        indll.deleteFirstNode();
        indll.deleteLastNode();
        indll.printDllForward();
        indll.printDllBackward();
    }
}
