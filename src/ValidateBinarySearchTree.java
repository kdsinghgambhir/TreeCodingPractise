/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class ValidateBinarySearchTree {
    public boolean isValidBst(Node node)
    {
        return Helper(node, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
    public boolean Helper(Node node, int min, int max)
    {
        if(node == null)
            return true;
        if(node.value < min || node.value > max)
            return false;
        if(node.value == Integer.MAX_VALUE && node.right != null)
            return false;
        if(node.value == Integer.MIN_VALUE && node.left != null)
            return false;
        return Helper(node.left, min, node.value-1)
                && Helper(node.right, node.value+1, max);
    }
    public static void main(String[] args) {
        ValidateBinarySearchTree validBSt = new ValidateBinarySearchTree();
        Node node = new Node(2);
        node.left = new Node(1);
        node.right = new Node(3);
        System.out.println("node -->  " + validBSt.isValidBst(node));
        
        Node node1 = new Node(5);
        node1.left = new Node(1);
        node1.right = new Node(4);
        node1.right.left = new Node(3);
        node1.right.right = new Node(6);
        System.out.println("node1 -->  " + validBSt.isValidBst(node1));
    }
}
