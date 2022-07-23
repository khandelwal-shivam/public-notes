//prefer Queue using linked list
import java.util.*;
public class QueueUsingArrayList<T> {
	private List<T> queue;
	private int front;
	private int rear;
	
	public QueueUsingArrayList(){
		queue = new ArrayList<T>();
		front = -1;
		rear = -1;
	}
	
	public void enqueue (T X) {
		if(isEmpty()){
			rear = 0; 
			front = 0;
		} else {
			rear++;
		}
		if(isFull())System.out.println("Queue is full");
		else queue.add(X);
	}
	
	public T dequeue() {
		T top = null;
		
		if(!isEmpty()) {
			top = queue.get(front);
			front++;
		}else{
			System.out.println("Queue is empty");
			front = -1;
			rear = -1;
		}
		return top;
	}
	
	private boolean isEmpty(){
		if(front == -1) return true;
		if(front == 0) return false;
		else return rear + 1 == front;
	}
	private boolean isFull() {
		if( rear+1 == queue.size() && front == 0)return true;
		else if( rear+1 == front)return true;
		else return false;
	}
	public static void main(String [] args){
		QueueUsingArrayList q = new QueueUsingArrayList();
		q.enqueue("Shivam");
		q.enqueue(123);
		q.enqueue(12.345);
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println(q.dequeue());
		System.out.println("front "+q.front);
		System.out.println("rear "+q.rear);
	}
}