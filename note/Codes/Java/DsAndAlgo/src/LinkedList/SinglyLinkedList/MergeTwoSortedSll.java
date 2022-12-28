package LinkedList.SinglyLinkedList;

public class MergeTwoSortedSll {
    public static class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    ListNode head1;
    ListNode head2;
    ListNode head;
    public void mergeTwoSortedList(){
        ListNode currentNode1 = head1,nextNode1 = null, currentNode2 = head2, nextNode2 = null;
        if(head1.data<head2.data){
            head = head1;
        } else {
            head = head2;
        }
        while(currentNode1!= null && currentNode2!=null){
            if(currentNode1.data>currentNode2.data) {
                nextNode2 = currentNode2.next;
                currentNode2.next = currentNode1;
                currentNode2 = nextNode2;
            } else {
                //currentNode1.data<currentNode2.data
                nextNode1 = currentNode1.next;
                currentNode1.next = currentNode2;
                currentNode1 = nextNode1;
            }
        }
    }
    public void printSll() {
        ListNode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode one = new ListNode(1);
        ListNode two = new ListNode(2);
        ListNode three = new ListNode(3);
        ListNode four = new ListNode(4);
        ListNode five = new ListNode(5);
        ListNode six = new ListNode(6);
        ListNode seven = new ListNode(7);
        ListNode eight = new ListNode(8);
        ListNode nine = new ListNode(9);
        ListNode ten = new ListNode(10);
        ListNode eleven = new ListNode(11);
        one.next = three;
        three.next = five;
        five.next = seven;
        seven.next = nine;
        nine.next = ten;
        ten.next = eleven;
        two.next = four;
        four.next = six;
        six.next = eight;
        MergeTwoSortedSll mtssll = new MergeTwoSortedSll();
        mtssll.head1 = one;
        mtssll.head2 = two;
        mtssll.mergeTwoSortedList();
        mtssll.printSll();
    }
}
