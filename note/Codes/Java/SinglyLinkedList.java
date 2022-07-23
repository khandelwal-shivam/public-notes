import java.util.LinkedList;
//will create problem if we want to delete character or integer.
//Character will convert into their ASCII value.
public class SinglyLinkedList<T> {
	private LinkedList <T> ll;
	public SinglyLinkedList(){
		ll = new LinkedList<T>();
	}
	private void add(T X){ll.add(X);}
	private void add(T X, int index){ll.add(index,X);}
	
	private void remove(T X){ll.remove(X);}
	private void remove(int index){ll.remove(index);}
	
	private void printLinkedList(){System.out.println(ll);}
	
	private int sizeOfLinkedList(){return ll.size();}
	
	public static void main(String [] args){
		SinglyLinkedList sll = new SinglyLinkedList();
		sll.add("ABC");
		sll.add(12.34);
		sll.add('a');
		sll.add(123);
		sll.add("begin",0);
		sll.add("end",sll.sizeOfLinkedList());
		sll.printLinkedList();
		sll.remove("ABC");
		sll.remove(0);
		sll.printLinkedList();
		/*ll.add("ABC");
		ll.add(123);
		ll.add('a');
		ll.add(12.34);
		System.out.println(ll);
		ll.remove("a");
		//insert at beginning
		ll.add(0,"begin");
		//insert at end 
		ll.add(ll.size(),"end");
		
		System.out.println("inserted at begin and end ");
		System.out.println(ll);
		
		//remove from beginning
		ll.remove(0);
		//insert at end 
		ll.remove(ll.size()-1);
		System.out.println("deleted from begin and end ");
		System.out.println(ll); */
	}
}