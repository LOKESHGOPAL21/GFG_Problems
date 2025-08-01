/*
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

*/
class Solution {
    
    public boolean isSymmetric(Node root) {
        // Code here
        if(root == null){
            return true;
        }
        
        return chec(root.left,root.right);
        
    }
    static boolean chec(Node l, Node r){
        if(l==null && r == null){
            return true;
        }
        if(l == null || r == null || l.data != r.data){
            return false;
        }
        
        return chec(l.left,r.right) && chec(l.right,r.left);
    }
}