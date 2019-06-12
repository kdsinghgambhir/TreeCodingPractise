
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class BinaryTreeLevelOrderTraversal {
    public List<List<Integer>> levelOrder(Node root)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(root == null)
            return result;
        Helper(root, 0, result);
        return result;
    }
    public void Helper(Node node, int level, List<List<Integer>> result)
    {
        if(node == null)
            return;
        List<Integer> list;
        if(level == result.size())
        {
            list = new ArrayList<>();
            result.add(list);
        }
        else
        {
            list = result.get(level);
        }
        list.add(node.value);
        Helper(node.left, level+1, result);
        Helper(node.right, level+1, result);
    }
    public static void main(String[] args) {
        BinaryTreeLevelOrderTraversal levelOrd = new BinaryTreeLevelOrderTraversal();
        Node node = new Node(3);
        node.left = new Node(9);
        node.right = new Node(20);
        node.right.left = new Node(15);
        node.right.right = new Node(7);
        System.out.println(levelOrd.levelOrder(node));
        
    }
}
