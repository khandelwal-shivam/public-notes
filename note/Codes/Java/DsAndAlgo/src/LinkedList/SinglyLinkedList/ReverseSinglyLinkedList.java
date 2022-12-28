package LinkedList.SinglyLinkedList;

public class ReverseSinglyLinkedList {
    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private ListNode head ;
    public void insertAtBeginning(int value) {
        ListNode beginning = new ListNode(value);
        beginning.next = head;
        head = beginning;
    }
    public void printSll(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current= current.next;
        }
        System.out.println("null");
    }

    public void reverseSinglyLinkedList() {
        ListNode currentNode = head;
        ListNode previousNode = null;
        ListNode nextNode = null;
        while(currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        head = previousNode;
    }

    public static void main(String[] args) {
        ReverseSinglyLinkedList rsll = new ReverseSinglyLinkedList();
        rsll.insertAtBeginning(5);
        rsll.insertAtBeginning(10);
        rsll.insertAtBeginning(15);
        rsll.insertAtBeginning(20);
        rsll.printSll();
        rsll.reverseSinglyLinkedList();
        rsll.printSll();
    }
}
