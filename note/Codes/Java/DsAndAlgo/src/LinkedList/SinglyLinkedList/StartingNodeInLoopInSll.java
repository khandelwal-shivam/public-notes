package LinkedList.SinglyLinkedList;
// This Algorithm is also called Flyod's Cycle detection Algorithm to detect cycle and to find staring node of cycle
public class StartingNodeInLoopInSll {
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
                System.out.println("Starting Point is --> "+findStartingPointInLoop(slowPointer));
                return true;
            }
        }
        return false;
    }
    public int findStartingPointInLoop(ListNode slowPointer) {
        ListNode current = head;
        while(current!=slowPointer){
            current = current.next;
            slowPointer = slowPointer.next;
        }
        return current.data;
    }

    public static void main(String[] args) {

        ListNode first = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        ListNode fourth = new ListNode(4);
        ListNode fifth = new ListNode(5);
        ListNode sixth = new ListNode(6);
        ListNode seventh = new ListNode(7);
        StartingNodeInLoopInSll snlsll = new StartingNodeInLoopInSll();
        snlsll.head = first;
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = seventh;
        seventh.next = fourth;
        snlsll.doesLoopExist();
    }
}
