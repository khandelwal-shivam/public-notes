package Tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeImplementation {
    public static class TreeNode {
        private int data;
        private TreeNode left;
        private TreeNode right;

        public TreeNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    private TreeNode root;

    public void createBinaryTree() {
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);
        TreeNode sixth = new TreeNode(6);
        TreeNode eleven = new TreeNode(11);
        root = first;
        first.left = second;
        first.right = third;
        second.left = fourth;
        second.right = fifth;
        third.left = sixth;
        sixth.right = eleven;

    }
    public void recursivePreOrder(TreeNode root) {
        if(root == null) return;
        System.out.print(root.data+" ");
        recursivePreOrder(root.left);
        recursivePreOrder(root.right);
    }

    public void recursiveInOrder(TreeNode root) {
        if(root == null) return;
        recursiveInOrder(root.left);
        System.out.print(root.data+" ");
        recursiveInOrder(root.right);
    }

    public void recursivePostOrder(TreeNode root) {
        if(root == null) return;
        recursivePostOrder(root.left);
        recursivePostOrder(root.right);
        System.out.print(root.data+" ");
    }

    public void iterativePreOrder(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()) {
            TreeNode current = stack.pop();
            System.out.print(current.data+ " ");
            if(current.right!=null)stack.push(current.right);
            if(current.left!=null)stack.push(current.left);
            /*
            * here we are pushing right tree firstly into stack because we want to traverse left tree first.
            */
        }
    }

    public void iterativeInOrder(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current!= null){
            if(current != null){
                stack.push(current);
                current = current.left;
            } else { // if temp == null but stack is not empty
                current = stack.pop();
                System.out.print(current.data+" ");
                current = current.right;
            }
        }

    }

    public void iterativePostOrder(TreeNode root) {
        if(root == null) return;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode current = root;
        while(!stack.isEmpty() || current!= null) {
            if(current != null) { // traversing up to left most part
                stack.push(current);
                current = current.left;
            } else {
                TreeNode temp = stack.peek().right;// checking whether the last pushed element into stack has right node or not
                if(temp != null) {
                    // this will be executed when left subtree is null and right subtree is present
                    current = temp;
                } else {
                    // this situation arises when last element pushed into stack is leaf node
                    temp = stack.pop();
                    System.out.print(temp.data + " ");
                    // Using Second while loop we are checking whether the last popped leaf node (temp) was left node or right node
                    // Condition in while loop will be true when we have visited both left and right node and want to print the parent.
                    // temp == stack.peek().right will be true when temp is right child of its parent.
                    while(!stack.isEmpty() && temp == stack.peek().right) {
                        temp = stack.pop();
                        System.out.print(temp.data+ " ");
                    }
                }
            }
        }
    }

    public void levelOrderTraversal() {
        if(root == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root); // offer adds an element at the end of queue
        while(!queue.isEmpty()) {
            TreeNode current = queue.poll(); // poll method removes first element from queue
            System.out.print(current.data+" ");
            if(current.left!=null)queue.offer(current.left);
            if(current.right!=null)queue.offer(current.right);
        }
    }

    /*
    *If time complexity is the point of focus, and number of recursive calls would be large, it is better to use iteration.
    * However, if time complexity is not an issue and shortness of code is, recursion would be the way to go.
    * */
    public int findMax(TreeNode parent){
        if(parent == null) return Integer.MIN_VALUE;
        int leftSubTreeMaxValue = findMax(parent.left);
        int rightSubTreeMaxValue = findMax(parent.right);
        int maxValue = parent.data;
        if(maxValue<leftSubTreeMaxValue ) maxValue = leftSubTreeMaxValue;
        if(maxValue<rightSubTreeMaxValue) maxValue = rightSubTreeMaxValue;
        return maxValue;
    }
    public static void main(String[] args) {
        BinaryTreeImplementation ti = new BinaryTreeImplementation();
        ti.createBinaryTree();
        ti.recursivePreOrder(ti.root);
        System.out.println("<--recursive pre order");
        ti.iterativePreOrder(ti.root);
        System.out.println("<--iterative pre order");
        ti.recursiveInOrder(ti.root);
        System.out.println("<-- recursive in order");
        ti.iterativeInOrder(ti.root);
        System.out.println("<--iterative in order");
        ti.recursivePostOrder(ti.root);
        System.out.println("<-- recursive post order");
        ti.iterativePostOrder(ti.root);
        System.out.println("<--iterative post order");
        ti.levelOrderTraversal();
        System.out.println("<-- Level order traversal");
        System.out.println("Max Value = "+ti.findMax(ti.root));


    }
}
