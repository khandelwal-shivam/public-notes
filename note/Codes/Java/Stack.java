public class Stack{
	
	private int maxSize;
	private long[] stackArray;
	private int top;
	
	public Stack(int size){
		this.maxSize = size;
		this.stackArray = new long[maxSize]; 
		this.top = -1;
	}
	
	public void push(long j) {
		if(!isFull()){
		top++;
		stackArray[top] = j;}
	}
	else {
		System.out.println("Stack is already full");
	}
	
	public long pop(){
		long popElement  = stackArray[top];
		top--;
		return popElement;
	}
	
	public boolean isEmpty() {
		return top == -1;
	}
	
	public boolean isFull() {
		return top == maxSize-1;
	}
	
	public long peek(){
		return stackArray[top];
	}
	public static void main(String[]args) {
		Stack st = new Stack(3);
		st.push(10);
		st.push(20);
		st.push(30);
		while(!st.isEmpty()) {
			System.out.println(st.pop());
		}
	}
	
}