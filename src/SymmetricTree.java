/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class SymmetricTree {
    public boolean isSymmetric(Node root)
    {
        if(root == null)
            return true;
        return isSymmetricHelper(root.left, root.right);
    }
    public boolean isSymmetricHelper(Node left, Node right)
    {
        if(left == null || right == null)
            return left == right;
        if(left.value != right.value)
            return false;
        return isSymmetricHelper(left.left, right.right) 
                && isSymmetricHelper(left.right, right.left);
    }
    public static void main(String[] args) {
        SymmetricTree symTree = new SymmetricTree();
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(2);
        node.left.left = new Node(3);
        node.left.right = new Node(4);
        node.right.left = new Node(4);
        node.right.right = new Node(3);
        System.out.println(symTree.isSymmetric(node));
    }
}
