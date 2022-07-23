import java.util.LinkedList;
import java.util.Queue;
public class QueueUsingLinkedList {
	
	public static void main(String []args){
		Queue <String> q = new LinkedList<>();
		q.add("Shin-Chan");
		q.add("Hagi-Maru");
		q.add("Ash");
		q.add("Naruto");
		System.out.println("Head = "+q.peek());
		int size = q.size();
		System.out.println("Size = "+size);
		while(size>0){
			System.out.println(q.remove());
			size--;
		}
	}
}