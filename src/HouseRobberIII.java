/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class HouseRobberIII {
    public int sum(Node root)
    {
        if(root == null)
            return 0;
        int [] res = dfs(root);
        return Math.max(res[0], res[1]);
    }
    public int[] dfs(Node node)
    {
        int[] res = new int[2];
        if(node == null)
            return res;
        int []left = dfs(node.left);
        int []right = dfs(node.right);
        res[0] = node.value + left[1] + right[1];
        res[1] = Math.max(left[1], left[0]) + Math.max(right[0], right[1]);
        return res;
    }
    public static void main(String[] args) {
        HouseRobberIII houserob = new HouseRobberIII();
        Node node = new Node(3);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.right = new Node(3);
        node.right.right = new Node(1);
        System.out.println(houserob.sum(node));
    }
}
