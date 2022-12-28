package LinkedList.SinglyLinkedList;

public class FindMiddleNode {

    public static class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data =  data;
            this.next = null;
        }
    }
    ListNode head = null;
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

    public int middleNode() {
        ListNode currentNode = head;
        ListNode middleNode = null;
        while(currentNode!=null && currentNode.next!=null){
            currentNode = currentNode.next.next;
            middleNode = middleNode.next;
        }
        return middleNode.data;
    }

    public static void main(String[] args) {
        FindMiddleNode fmn = new FindMiddleNode();
        fmn.insertAtBeginning(5);
        fmn.insertAtBeginning(10);
        fmn.insertAtBeginning(15);
        fmn.insertAtBeginning(20);
        fmn.insertAtBeginning(25);
        fmn.insertAtBeginning(30);
        fmn.insertAtBeginning(35);
        fmn.insertAtBeginning(40);
        fmn.printSll();
        System.out.println("Middle Node --> "+fmn.middleNode());
    }
}
