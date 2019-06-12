/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Karandeep Singh
 */
public class UniqueBinarySearchTrees {
    public int find(int n)
    {
        if(n <= 1)
            return n;
        int [] M = new int[n+1];
        M[0] = 1;
        M[1] = 1;
        for(int i = 2; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                M[i] += M[i-j] * M[j-1];
            }
        }
        return M[n];
    }
    public static void main(String[] args) {
        UniqueBinarySearchTrees num = new UniqueBinarySearchTrees();
        System.out.println(num.find(3));
    }
}
