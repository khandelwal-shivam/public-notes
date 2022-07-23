/*Inorder Traversal of BST gives sorted Input*/

public class BinarySearchTree{
	
	public class Node{
		int key;
		Node left,right;
		public Node(int item){
			key = item;
			left = right = null;
		}
	}
	// Root of BST
	private Node root;
	
	public BinarySearchTree(){
		root = null;
	}
	//inserting value in BST
	public void insert(int key){
		if(root == null){
			root = new Node(key);
		} else {
			Node current = root;
			Node parent;
			while(true){
				parent = current;
				if(key<current.key){current = current.left;}
				else {current = current.right;}
				
				if(current == null){
					current = new Node(key);
					if(key < parent.key){parent.left = current;}
					else {parent.right = current;}
					break;
				}
			}
		}		
		
	}
	public void inOrderTraversal(Node root){
		if(root == null)return;
		inOrderTraversal(root.left);
		System.out.print(","+root.key);
		inOrderTraversal(root.right);
	}
	public void preOrderTraversal(Node root){
		if(root == null)return;
		System.out.print(","+root.key);
		preOrderTraversal(root.left);
		preOrderTraversal(root.right);
	}
	public void postOrderTraversal(Node root){
		if(root == null)return ;
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(","+root.key);
	}
	public int findMin(Node root){
		Node current = root;
		while(true){
			if(current.left == null){
				return current.key;
			}
			else{
				current = current.left;
			}
		}
	}
	public boolean delete(int key){
		Node current = root;
		Node parent = root;
		if(root == null)return false;
		while(current.key!=key){
			parent = current;
			if(key<current.key){current = current.left;}
			else{current = current.right;}
			
			if(current == null)return false;
		}
		Node nodeToDelete = current;
		//if node is leaf node
		if(nodeToDelete.left == null && nodeToDelete.right == null){
			if(nodeToDelete == root)root = null;
			else if(nodeToDelete.key<parent.key)parent.left = null;
			else parent.right = null;
		}
		//if node has one child
		        else if(nodeToDelete.left == null || nodeToDelete.right == null){
            if(nodeToDelete == root){
                if(nodeToDelete.right == null){root = nodeToDelete.left;}
                else {root = nodeToDelete.right;}
            }
            else if(nodeToDelete.left == null){
                if(parent.key > nodeToDelete.key){parent.left = nodeToDelete.right;} // if node to delete is parent's left child
                else{parent.right = nodeToDelete.right;}
            }else {
                if(parent.key > nodeToDelete.key){parent.left = nodeToDelete.left;} // if node to delete is parent's left child
                else{parent.right = nodeToDelete.left;}
            }
        }
		// if node has 2 children
		else{
			nodeToDelete.key = findInorderSuccessor(nodeToDelete.right);
		}
		return true;
	}
	
	private int findInorderSuccessor(Node item){
		Node current = item;
		Node parent = item;
		while(current.left!= null){
			parent = current;
			current = current.left;
		}
		parent.left = null;
		return current.key;
	}
	
	public static void main(String[] args){
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
        bst.insert(20);
        bst.insert(40);
        bst.insert(70);
        bst.insert(60);
        bst.insert(80);
		bst.inOrderTraversal(bst.root);
		System.out.println("pre order");
		bst.preOrderTraversal(bst.root);
		System.out.println("post order");
		bst.postOrderTraversal(bst.root);
		System.out.println("Min = "+bst.findMin(bst.root));
		if(bst.delete(50)){
			System.out.println("50 deleted");
			bst.inOrderTraversal(bst.root);
		}
		if(bst.delete(20)){
			System.out.println("\n 20 deleted");
			bst.inOrderTraversal(bst.root);
		}
		if(bst.delete(70)){
			System.out.println("\n 70 deleted");
			bst.inOrderTraversal(bst.root);
		}
		if(bst.delete(110)){
			System.out.println("\n 110 deleted");
			bst.inOrderTraversal(bst.root);
		}
	}
}