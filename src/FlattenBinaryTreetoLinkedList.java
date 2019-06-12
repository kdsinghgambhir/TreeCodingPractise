/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class FlattenBinaryTreetoLinkedList {
    Node prev = null;
    public void flatten(Node root)
    {
        if(root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = prev;
        root.left = null;
        prev = root;
    }
    public void print(Node node)
    {
        if(node == null)
            return;
        print(node.left);
        print(node.right);
        System.out.println(node.value);
    }
    public static void main(String[] args) {
        FlattenBinaryTreetoLinkedList flat = new FlattenBinaryTreetoLinkedList();
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(5);
        node.left.left = new Node(3);
        node.left.right = new Node(4);
        node.right.right = new Node(6);
        flat.flatten(node);
        flat.print(node);
    }
}
