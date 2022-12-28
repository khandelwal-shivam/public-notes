package LinkedList.SinglyLinkedList;

public class InsertNodeInSortedSll {
    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data= data;
        }
    }
    ListNode head;

    public void printSll() {
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public void insertAtBeginning(int value){
        ListNode newNode = new ListNode(value);
        newNode.next = head;
        head = newNode;
    }
    public void insertNode(int value){
        ListNode newNode = new ListNode(value);
        ListNode current = head;
        ListNode previous = null;
        while(current != null && current.data<value ){
            previous = current;
            current = current.next;
        }
        newNode.next = current;
        previous.next = newNode;
    }
    public static void main(String[] args) {
        InsertNodeInSortedSll inssll = new InsertNodeInSortedSll();
        inssll.insertAtBeginning(95);
        inssll.insertAtBeginning(85);
        inssll.insertAtBeginning(75);
        inssll.insertAtBeginning(65);
        inssll.insertAtBeginning(55);
        inssll.insertAtBeginning(45);
        inssll.insertAtBeginning(35);
        inssll.insertAtBeginning(25);
        inssll.insertAtBeginning(15);
        inssll.printSll();
        inssll.insertNode(33);
        inssll.insertNode(55);
        inssll.insertNode(33);
        inssll.printSll();
    }
}
