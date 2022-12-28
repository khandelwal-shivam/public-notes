package LinkedList.SinglyLinkedList;

public class NthPositionFromEnd {
    public static class ListNode {
        private int data;
        private ListNode next;
        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    ListNode head;
    public void insertAtBeginning(int value){
        ListNode beginning = new ListNode(value);
        beginning.next = head;
        head = beginning;
    }
    public void printSll(){
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current= current.next;
        }
        System.out.println("null");
    }

    public int NthFromEnd(int end){
        // corner case missing. What if end is greater than length of singly linked list
        int count = 0 ;
        ListNode mainPointer = head;
        ListNode nthPosPointer = head;
        while(count<end){
            mainPointer = mainPointer.next;
            count++;
        }
        while(mainPointer!= null){
            nthPosPointer = nthPosPointer.next;
            mainPointer = mainPointer.next;
        }
        return nthPosPointer.data;
    }
    public static void main(String[] args) {
        NthPositionFromEnd nfe = new NthPositionFromEnd();
        nfe.insertAtBeginning(5);
        nfe.insertAtBeginning(15);
        nfe.insertAtBeginning(25);
        nfe.insertAtBeginning(35);
        nfe.insertAtBeginning(45);
        nfe.insertAtBeginning(55);
        nfe.insertAtBeginning(65);
        nfe.insertAtBeginning(75);
        nfe.insertAtBeginning(85);
        nfe.insertAtBeginning(95);
        nfe.printSll();
        System.out.println(nfe.NthFromEnd(12));
    }
}
