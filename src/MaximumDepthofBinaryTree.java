/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class MaximumDepthofBinaryTree {
    public int maxDepth(Node root)
    {
        if(root == null)
            return 0;
        return Math.max(maxDepth(root.left)+1 , maxDepth(root.right)+1);
    }
    public static void main(String[] args) {
        MaximumDepthofBinaryTree maxD = new MaximumDepthofBinaryTree();
        Node node = new Node(3);
        node.left = new Node(9);
        node.right = new Node(20);
        node.right.left = new Node(15);
        node.right.right = new Node(7);
        System.out.println(maxD.maxDepth(node));
    }
}
