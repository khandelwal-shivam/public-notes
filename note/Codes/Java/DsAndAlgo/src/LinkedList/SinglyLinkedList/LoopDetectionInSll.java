package LinkedList.SinglyLinkedList;

public class LoopDetectionInSll {
    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    ListNode head;
    public boolean doesLoopExist() {
        ListNode slowPointer = head;
        ListNode fastPointer = head;

        while((fastPointer!= null && fastPointer.next!= null) ) {
            fastPointer = fastPointer.next.next;
            slowPointer = slowPointer.next;
            if(slowPointer == fastPointer){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);
        LoopDetectionInSll ldsll = new LoopDetectionInSll();
        ldsll.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = third;
        System.out.println("does loop exist --> "+ldsll.doesLoopExist());
    }
}
