/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class LowestCommonAncestorofBT {
    public Node lowestCommonAncestor(Node root, Node p, Node q)
    {
        if(root == null)
            return null;
        if(p == root || q == root)
            return root;
        Node left = lowestCommonAncestor(root.left, p, q);
        Node right = lowestCommonAncestor(root.right, p, q);
        if(left != null && right != null)
            return root;
        if(left == null && right == null)
            return null;
        return (left != null ? left : right);
    }
    public static void main(String[] args) {
        LowestCommonAncestorofBT LCABT = new LowestCommonAncestorofBT();
        Node root = new Node(3);
        root.left = new Node(5);
        root.right = new Node(1);
        root.left.left = new Node(6);
        root.left.right = new Node(2);
        root.left.right.left = new Node(7);
        root.left.right.right = new Node(4);
        root.right.left = new Node(0);
        root.right.right = new Node(8);
        
        Node p = new Node(5);
        Node q = new Node(1);
        System.out.println(LCABT.lowestCommonAncestor(root, p, q));
    }
}
