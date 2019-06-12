/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class BTfromPreorderANDInorder {
    public Node buildTree(int[] preorder, int[] inorder)
    {
        return Helper(0, 0, inorder.length-1, preorder, inorder);
    }
    public Node Helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder)
    {
        if(preStart > preorder.length-1 || inStart > inEnd)
            return null;
        int index = 0;
        Node node = new Node(preorder[preStart]);
        for(int i = inStart; i <= inEnd; i++)
        {
            if(node.value == inorder[i])
            {
                index = i;
            }
        }
        node.left = Helper(preStart+1, inStart, index-1, preorder, inorder);
        node.right = Helper(preStart-inStart+index+1, index+1, inEnd, preorder, inorder);
        return node;
    }
    public static void main(String[] args) {
        BTfromPreorderANDInorder preANDin = new BTfromPreorderANDInorder();
        int[] preorder = new int[] {3,9,20,15,7};
        int[] inorder = new int[] {9,3,15,20,7};
        preANDin.buildTree(preorder, inorder);
    }
}
