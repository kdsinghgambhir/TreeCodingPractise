/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class PathSumIII {
    public int pathSum(Node node, int sum)
    {
        if(node == null)
            return 0;
        return pathSumFrom(node, sum)
                + pathSum(node.left, sum)
                + pathSum(node.right, sum);
    }
    public int pathSumFrom(Node node, int sum)
    {
        if(node == null)
            return 0;
        return (node.value == sum ? 1 : 0)
                + pathSumFrom(node.left, sum-node.value)
                + pathSumFrom(node.right, sum-node.value);
    }
    public static void main(String[] args) {
        PathSumIII pathSum = new PathSumIII();
        Node node = new Node(10);
        node.left = new Node(5);
        node.right = new Node(-3);
        node.left.left = new Node(3);
        node.left.right = new Node(2);
        node.left.left.left = new Node(3);
        node.left.left.right = new Node(-2);
        node.left.right.right = new Node(1);
        node.right.right = new Node(11);
        System.out.println(pathSum.pathSum(node, 8));
    }
}
