package Stack;

public class BalancingParenthesis {
    public class ListNode{
        private char data;
        private ListNode next;

        public ListNode(char data) {
            this.data = data;
        }
    }
    private ListNode top;
    public void push(char data) {
        ListNode newNode = new ListNode(data);
        newNode.data = data;
        newNode.next = top;
        top = newNode;
    }

    public char pop(){
        char poppedChar = top.data;
        top = top.next;
        return poppedChar;
    }

    public BalancingParenthesis(){
        this.top = null;
    }
    public boolean isParenthesisBalanced(char[] chars,BalancingParenthesis bp ){
        for(char c: chars) {
            if(c == '{' || c == '[' || c == '(') bp.push(c);
            else {
                if(top == null) return false;
                char popped = bp.pop();
                if(!((popped == '{' && c == '}') || (popped == '[' && c == ']') || (popped == '(' && c == ')'))){
                    return false;
                }
            }
        }
        return top == null;
    }
    public static void main(String[] args) {
        //Stack is an well defined class in java collections under java.util package
        BalancingParenthesis bp = new BalancingParenthesis();
        String str = "{()}[[{}{()}]]";
        char chars[] = str.toCharArray();
//        bp.balanceParenthesis(chars, bp) ? System.out.println("Imbalnced"):System.out.println("balanced");
        if(bp.isParenthesisBalanced(chars,bp)) {
            System.out.println("balanced");
        } else {
            System.out.println("imbalanced");
        }

    }
}
