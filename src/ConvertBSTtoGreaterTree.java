/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class ConvertBSTtoGreaterTree {
    int sum = 0;
    public Node convertBST(Node node)
    {
        if(node == null)
            return null;
        convertBST(node.right);
        node.value += sum;
        sum = node.value;
        convertBST(node.left);
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
        ConvertBSTtoGreaterTree convert = new ConvertBSTtoGreaterTree();
        Node node = new Node(5);
        node.left = new Node(2);
        node.right = new Node(13);
        convert.convertBST(node);
        convert.inorder(node);
    }
}
