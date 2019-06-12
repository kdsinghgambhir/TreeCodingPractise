/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class InvertBinaryTree {
    public Node invertTree(Node node)
    {
        if(node == null)
            return  null;
        Node left = invertTree(node.left);
        Node right = invertTree(node.right);
        node.left = right;
        node.right = left;
        return node;
    }
    public void inorder(Node node)
    {
        if(node == null)
            return;
        inorder(node.left);
        System.out.println(node.value);
        inorder(node.right);
    }
    public static void main(String[] args) {
        InvertBinaryTree invert = new InvertBinaryTree();
        Node node = new Node(4);
        node.left = new Node(2);
        node.right = new Node(7);
        node.left.left = new Node(1);
        node.left.right = new Node(3);
        node.right.left = new Node(6);
        node.right.right = new Node(9);
        invert.invertTree(node);
        invert.inorder(node);
    }
}
