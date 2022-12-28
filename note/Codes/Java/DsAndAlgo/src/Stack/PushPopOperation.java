package Stack;

public class PushPopOperation {
    private class ListNode {
        private int data;
        private ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public ListNode top;
    public int length;
    public PushPopOperation() {
        top = null;
        length = 0;
    }
    public void push(int data) {
        ListNode newNode = new ListNode(data);
        newNode.data = data;
        newNode.next = top;
        top = newNode;
        length++;
    }
    public void pop(){
        System.out.println("popped data "+top.data);
        top = top.next;
        length--;
    }
    public void traverseStackFromTopToBottom() {
        ListNode current = top;
        while(current!= null) {
            System.out.print(current.data+"-->");
            current = current.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        //Stack is an well defined class in java collections under java.util package
        PushPopOperation ppo = new PushPopOperation();
        ppo.push(10);
        ppo.push(15);
        ppo.push(20);
        ppo.push(25);
        ppo.push(30);
        ppo.push(35);
        ppo.push(40);
        ppo.traverseStackFromTopToBottom();
        ppo.pop();
        ppo.pop();
        ppo.traverseStackFromTopToBottom();
    }
}
