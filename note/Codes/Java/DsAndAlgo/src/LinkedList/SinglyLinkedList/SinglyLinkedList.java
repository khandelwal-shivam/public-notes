package LinkedList.SinglyLinkedList;

public class SinglyLinkedList {

    private static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data){
            this.data = data;
            this.next = null;
        }
    }
    private ListNode head;

    public void printSll(){
        ListNode current = head;
        while(current != null){
            System.out.print(current.data+"-->");
            current= current.next;
        }
        System.out.println("null");
    }
    public int lengthOfSll() {
        ListNode current = head;
        int length = 0;
        while(current != null){
            length++;
            current = current.next;
        }
        return length;
    }

    public void insertAtBeginning(int value) {
        ListNode beginning = new ListNode(value);
        beginning.next = head;
        head = beginning;
    }

    public void insertAtEnd(int value) {
        ListNode end = new ListNode(value);
        ListNode current = head;
        while(current.next != null){
            current = current.next;
        }
        current.next = end;
    }

    public void insertAtGivenPosition(int value, int positionToInsertValue) {
        if(positionToInsertValue == 1){
            ListNode beginning = new ListNode(value);
            beginning.next = head;
            head = beginning;
        } else {
            int current_position = 1;
            ListNode current = head;
            while(current_position < positionToInsertValue-1){
                current_position++;
                current = current.next;
            }
            ListNode newNode = new ListNode(value);
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    public void deleteFromBeginning() {
        if(head == null) return;
        head = head.next;
    }
    public void deleteFromEnd(){
        if(head == null) return;
        if(head.next == null) head = null;
        else{
            ListNode current = head;
            while(current.next.next!=null) {
                current = current.next;
            }
            current.next = null;
        }
    }

    public void deleteFromAnyPosition(int position) {
        if(position == 1){
            head = head.next;
        } else {
            int current_position = 1;
            ListNode current = head;
            while(current_position<position-1){
                current = current.next;
                current_position++;
            }
            current.next = current.next.next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode second = new ListNode(1);
        ListNode third = new ListNode(8);
        ListNode fourth = new ListNode(11);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.printSll();
        System.out.println(sll.lengthOfSll());
        sll.insertAtBeginning(22);
        sll.insertAtBeginning(24);
        sll.insertAtBeginning(30);
        sll.insertAtEnd(28);
        sll.insertAtEnd(26);
        sll.insertAtGivenPosition(50,3);
        sll.printSll();
        sll.deleteFromBeginning();
        sll.printSll();
        sll.deleteFromEnd();
        sll.printSll();
        sll.deleteFromAnyPosition(4);
        sll.printSll();
    }
}
