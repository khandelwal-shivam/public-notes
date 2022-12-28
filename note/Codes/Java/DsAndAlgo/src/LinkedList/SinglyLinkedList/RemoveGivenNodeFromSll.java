package LinkedList.SinglyLinkedList;

public class RemoveGivenNodeFromSll {
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
    public void removeGivenNode(int value){
        ListNode current = head;
        ListNode previous = null;
        while(current!= null && current.data != value) {
            previous = current;
            current = current.next;
        }
        if(current == null){
            System.out.println(value+" not found in Linked List");
        } else if(current == head){
            head = head.next;
        } else {
            previous.next = current.next;
        }

    }

    public static void main(String[] args) {
        RemoveGivenNodeFromSll rgnsll = new RemoveGivenNodeFromSll();
        rgnsll.insertAtBeginning(95);
        rgnsll.insertAtBeginning(85);
        rgnsll.insertAtBeginning(75);
        rgnsll.insertAtBeginning(65);
        rgnsll.insertAtBeginning(55);
        rgnsll.insertAtBeginning(45);
        rgnsll.insertAtBeginning(35);
        rgnsll.insertAtBeginning(25);
        rgnsll.insertAtBeginning(15);
        rgnsll.printSll();
        rgnsll.removeGivenNode(15);
        rgnsll.removeGivenNode(95);
        rgnsll.printSll();
        rgnsll.removeGivenNode(33);
    }
}
