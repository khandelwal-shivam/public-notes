package Stack;

public class ReverseStringUsingStack {
    public class ListNode {
        public char data;
        public ListNode next;

        public ListNode(char data) {
            this.data = data;
            this.next = null;
        }
    }
    private ListNode top;
    public ReverseStringUsingStack() {
        this.top = null;
    }
    public void push(char data) {
        ListNode newNode = new ListNode(data);
        newNode.data = data;
        newNode.next = top;
        top = newNode;
    }
    public void pop(){
        System.out.print(top.data);
        top = top.next;
    }

    public static void main(String[] args) {
        //Stack is an well defined class in java collections under java.util package
        ReverseStringUsingStack rsus = new ReverseStringUsingStack();
        String str = "My Name is Shivam Khandelwal";
        char [] chars = str.toCharArray();
        for(char c: chars){
            rsus.push(c);
        }
        for(char c: chars) {
            rsus.pop();
        }
    }
}
