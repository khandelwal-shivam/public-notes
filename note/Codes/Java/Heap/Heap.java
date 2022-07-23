import java.util.*;
public class Heap {
	private List<Node> HeapArray;
	
	public Heap(){
		HeapArray = new ArrayList<Node>();
	}
	class Node {
		int key;
		public Node(int key) {
			this.key = key;
		}
		public int getKey(){
			return key;
		}
		public void setKey(int key){
			this.key = key;
		}
	}
	public int getSize(){
		return HeapArray.size();
	}
	
	public boolean isEmpty(){
		return HeapArray.size() == 0;
	}
	
	public void insert(int key){
		Node newNode = new Node(key);
		HeapArray.add(newNode);
		trickleUp();
	}
	
	public void trickleUp(){
		// places the largest key at top of Heap
		int index = HeapArray.size()-1;
		int parentIndex = (index-1)/2;
		while(index>0 && HeapArray.get(index).getKey()>HeapArray.get(parentIndex).getKey()){
			//move parent up
			Node temp = HeapArray.get(index);
			HeapArray.set(index,HeapArray.get(parentIndex));
			HeapArray.set(parentIndex,temp);
			index = parentIndex;
			parentIndex = (parentIndex-1)/2;
		}
	}
	public void delete(){
		Node root = HeapArray.get(0);
		HeapArray.set(0,HeapArray.get(HeapArray.size()-1));
		HeapArray.remove(HeapArray.size()-1);
		trickelDown(0);
		
	}
	public void trickelDown(int index){
		int largerChildIndex;
		Node top = HeapArray.get(index); // the actual Node which we want to tricke down
		while(index < HeapArray.size()/2){
			int leftChildIndex = 2*index+1;
			int rightChildIndex = 2*index+2;
			
			if(rightChildIndex < HeapArray.size()-1 && HeapArray.get(leftChildIndex).getKey() < HeapArray.get(rightChildIndex).getKey()){
				largerChildIndex = leftChildIndex;
			}
			else{
				largerChildIndex = rightChildIndex;
			}
			if(top.getKey()>HeapArray.get(largerChildIndex).getKey()){
				break;
			}
			HeapArray.set(index,HeapArray.get(largerChildIndex));
			index = largerChildIndex;
		}
		HeapArray.set(index,top);
	}
	
	public static void main(String[] args){
		Heap heap =  new Heap();
		heap.insert(5);
		heap.insert(3);
		heap.insert(17);
		heap.insert(10);
		heap.insert(84);
		heap.insert(19);
		heap.insert(6);
		heap.insert(22);
		heap.insert(9);
		heap.HeapArray.forEach(arr->{
			System.out.print(","+arr.getKey());
		});
		heap.delete();
		System.out.println();
		heap.HeapArray.forEach(arr->{
			System.out.print(","+arr.getKey());
		});
	}
}