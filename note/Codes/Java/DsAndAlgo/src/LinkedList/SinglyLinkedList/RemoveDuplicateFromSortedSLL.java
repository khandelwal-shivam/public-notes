package LinkedList.SinglyLinkedList;

public class RemoveDuplicateFromSortedSLL {
    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
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
    public void removeDuplicate(){
        ListNode current = head;
        ListNode nextNode = null;
        while(current!=null && current.next!=null){
            nextNode = current.next;
            if(current.data == nextNode.data){
                current.next = nextNode.next;
            } else {
                current = nextNode;
            }
        }
    }
    public static void main(String[] args) {
        RemoveDuplicateFromSortedSLL rdsll = new RemoveDuplicateFromSortedSLL();
        rdsll.insertAtBeginning(5);
        rdsll.insertAtBeginning(15);
        rdsll.insertAtBeginning(15);
        rdsll.insertAtBeginning(25);
        rdsll.insertAtBeginning(35);
        rdsll.insertAtBeginning(35);
        rdsll.insertAtBeginning(35);
        rdsll.insertAtBeginning(45);
        rdsll.insertAtBeginning(55);
        rdsll.insertAtBeginning(55);
        rdsll.insertAtBeginning(75);
        rdsll.printSll();
        rdsll.removeDuplicate();
        rdsll.printSll();
    }
}
