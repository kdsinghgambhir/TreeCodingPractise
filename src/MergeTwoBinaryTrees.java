/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class MergeTwoBinaryTrees 
{
    public Node mergeTrees(Node t1, Node t2)
    {
        if(t1 == null && t2 == null)
            return null;
        if(t1 == null)
            return t2;
        if(t2 == null)
            return t1;
        t1.value += t2.value;
        t1.left = mergeTrees(t1.left, t2.left);
        t1.right = mergeTrees(t1.right, t2.right);
        return t1;
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
        MergeTwoBinaryTrees merge = new MergeTwoBinaryTrees();
        Node t1 = new Node(1);
        t1.left = new Node(3);
        t1.right = new Node(2);
        t1.left.left = new Node(5);
        
        Node t2 = new Node(2);
        t2.left = new Node(1);
        t2.right = new Node(3);
        t2.left.right = new Node(4);
        t2.right.right = new Node(7);
        
        merge.mergeTrees(t1, t2);
        merge.inorder(t1);
    }
}
