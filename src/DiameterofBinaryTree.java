/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class DiameterofBinaryTree {
    int Diameter = 0;
    public int diamterOfBT(Node root)
    {
        Helper(root);
        return Diameter;
    }
    public int Helper(Node node)
    {
        if(node == null)
            return 0;
        int left = Helper(node.left);
        int right = Helper(node.right);
        Diameter = Math.max(Diameter, left+right);
        return Math.max(left, right)+1;
    }
    public static void main(String[] args) {
        DiameterofBinaryTree diamter = new DiameterofBinaryTree();
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        System.out.println(diamter.diamterOfBT(node));
    }
}
