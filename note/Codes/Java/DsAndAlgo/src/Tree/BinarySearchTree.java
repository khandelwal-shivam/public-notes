package Tree;

import java.util.Stack;

public class BinarySearchTree {
    // difference between binary tree and bst is that in bst left node is smaller than parent and right node is larger than parent

    public static class TreeNode{
        private int data;
        private TreeNode left,right;

        public TreeNode(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    private TreeNode root;
    public BinarySearchTree() {
        root = null;
    }
    public void insert(int data) {
        root = insertValueInBstUsingRecursion(data,root);
    }
    public TreeNode insertValueInBstUsingRecursion(int value, TreeNode parent) {
        if(parent == null) {
            return new TreeNode(value);
        }
        if(parent.data>value) {
            parent.left = insertValueInBstUsingRecursion(value,parent.left);
        } else {
            parent.right = insertValueInBstUsingRecursion(value,parent.right);
        }
        return parent;
    }

    public void inOrderTraversal(){
        Stack<TreeNode> st =new Stack<>();
        st.push(root);
        while(!st.isEmpty()) {
            TreeNode temp = st.pop();
            System.out.print(temp.data+" ");
            if(temp.right!=null)st.push(temp.right);
            if(temp.left!=null)st.push(temp.left);
        }
        System.out.println();
    }

    public void searchKeyInBST(int key, TreeNode parent) {
        if(parent == null) System.out.println(key+" not found");

        else if(key == parent.data) System.out.println(key+ " found in tree" );
        else if(key < parent.data) searchKeyInBST(key,parent.left);
        else searchKeyInBST(key,parent.right);
    }

    public boolean isValid(TreeNode parent, int min, int max){
        /*
         * Here we are expected to validate whether a given tree is valid BST
         * */

        /*
         * Following 2 properties should be kept in mind while finding the ranges.
         *
         * 1. If we go towards left subtree min remains same, max changes to parent value
         *
         * 2. If we go towards right subtree max remains same, min changes to parent value
         * */


        if(parent == null) return true;
        if(parent.data>=max || parent.data<=min) return false;
        return isValid(parent.left, min, parent.data) && isValid(parent.right, parent.data, max);
    }

    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(13);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.inOrderTraversal();
        bst.searchKeyInBST(14,bst.root);
        if(bst.isValid(bst.root,Integer.MIN_VALUE,Integer.MAX_VALUE)){
            System.out.println("Tree is valid");
        } else {
            System.out.println("Tree is invalid");
        }
    }
}
