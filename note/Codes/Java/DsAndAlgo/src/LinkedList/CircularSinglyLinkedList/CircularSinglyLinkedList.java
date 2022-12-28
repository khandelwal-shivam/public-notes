package LinkedList.CircularSinglyLinkedList;

public class CircularSinglyLinkedList {

    private class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private ListNode lastNode;
    private int length;

    public CircularSinglyLinkedList() {
        this.lastNode = null;
        this.length = 0;
    }

    public int length(){
        return this.length;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void insertNodeAtBeginning(int data) {
        ListNode newNode = new ListNode(data);
        if(length == 0) {
            lastNode = newNode;
            newNode.next = lastNode;
        } else {
            newNode.next = lastNode.next;
            lastNode.next = newNode;
        }
        length++;
    }

    public void insertAtEnd(int data) {
        ListNode newNode = new ListNode(data);
        if(length == 0) {
            lastNode = newNode;
            newNode.next = lastNode;
        } else {
            newNode.next = lastNode.next;
            lastNode.next = newNode;
            lastNode = newNode;
        }
        length++;
    }
    public int removeFirstNode() {
        ListNode nodeToBeDeleted = lastNode.next;
        lastNode.next = nodeToBeDeleted.next;
        return nodeToBeDeleted.data;
    }
    public void printCsll() {
        ListNode current = lastNode;
        while(current.next!=lastNode){
            current = current.next;
            System.out.print(current.data+"-->");
        }
        current = current.next;
        System.out.println(current.data);
    }
    public static void main(String[] args) {
        CircularSinglyLinkedList csll = new CircularSinglyLinkedList();
        csll.insertAtEnd(5);
        csll.insertAtEnd(10);
        csll.insertAtEnd(15);
        csll.insertAtEnd(20);
        csll.insertAtEnd(25);
        csll.insertNodeAtBeginning(30);
        csll.insertNodeAtBeginning(35);
        csll.printCsll();
        csll.removeFirstNode();
        csll.printCsll();
    }
}
