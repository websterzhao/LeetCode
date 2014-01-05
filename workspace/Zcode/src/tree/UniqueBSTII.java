package tree;

import java.util.ArrayList;
import anode.TreeNode;

public class UniqueBSTII {
/*	
 * Think it in a deductive way:
	n=1, one unique BST.
	n=2, pick one value, and the one remaining node can be built as one BST, i.e. Two BSTs.
	... ...
	n=k, pick one value i, and split the remaining values to two groups: [1 .. i-1] goes to left subtree and [i+1 .. n] goes to right subtree. Then the problem becomes to construct BSTs with left subtree from BST(1, i-1) and right subtree from BST(i+1, n), where BST(1, i-1) and BST(i+1, n) has been computed in previous iterations.
	It is easy to get to a recursive solution:
	Given a range [l .. r], if l > r, return a list containing an empty tree.
	Otherwise, for each value k between l and r, inclusively
	recursively compute BSTs in range [l .. k-1] and range [k+1 .. r]
	construct BSTs with root of k, left subtree from BST(1, i-1) and right subtree from BST(i+1, n).
 * 
 */	
	public ArrayList<TreeNode> generateTrees(int n) {
		return genSubTrees(1, n);
	}

	private ArrayList<TreeNode> genSubTrees(int l, int r) {
		ArrayList<TreeNode> trees = new ArrayList<TreeNode>();
		if (l > r) // return an empty tree
			trees.add(null);
		else {
			for (int i = l; i <= r; ++i) {
				ArrayList<TreeNode> lefts = genSubTrees(l, i - 1);
				ArrayList<TreeNode> rights = genSubTrees(i + 1, r);
				for (TreeNode left : lefts) {
					for (TreeNode right : rights) {
						TreeNode root = new TreeNode(i);
						root.left = left;
						root.right = right;
						trees.add(root);
					}
				}
			}
		}
		return trees;
	}
	
/*	
Solution - DP

Noticing the repeat computation in the above algorithm gives us a hint of DP: Can we store some intermediate results so as to reuse it rather than recomputing it?

The answer is yes and we can store BSTs of range [i .. i+k] and then for next range [i .. i+k+1] we can reuse previous results!

Now the algorithm becomes:
Create a table T containing lists of BSTs such that T[i, l] = a list of BSTs of range [i .. i+l].
Initialize the table with T[i, 0] which are all single node trees.
Increasing the size of range from 1 to n-1 and fill up the table.
For each range size l,
 For each starting value i,
For each value k in [i, i+l], construct BSTs with root of k, left subtree from BSTs of [i, k-i-1] and right subtree from BSTs of [k+1, i+l-k-1].
Finally, T[0, n-1] gives us the result of all BSTs.	
*/
 public ArrayList<TreeNode> generateTrees1(int n) {  
   if (n < 1) {  
     ArrayList<TreeNode> trees = new ArrayList<TreeNode>();  
     trees.add(null);  
     return trees;  
   }  
   
   // T[i,l] contains a list of BSTs of [i .. i+l]  
   ArrayList<ArrayList<ArrayList<TreeNode>>> allNumTrees = new ArrayList<ArrayList<ArrayList<TreeNode>>>(n);  
   
   // init with single node trees  
   for (int i=1; i<=n; ++i) {  
     ArrayList<ArrayList<TreeNode>> numTrees = new ArrayList<ArrayList<TreeNode>>(n-i);  
     ArrayList<TreeNode> trees = new ArrayList<TreeNode>();  
     TreeNode root = new TreeNode(i);  
     trees.add(root);  
     numTrees.add(trees);  
     allNumTrees.add(numTrees);  
   }  
   
   // fill up the table  
   for (int l=1; l<n; ++l) { // levels  
     for (int i=0; i<n-l; ++i) { // starting number  
       ArrayList<ArrayList<TreeNode>> numTrees = allNumTrees.get(i);  
       ArrayList<TreeNode> trees = new ArrayList<TreeNode>();  
       for (int k=i; k<=i+l; ++k) { // root value  
         if (k == i) {  
           for (TreeNode right : allNumTrees.get(k+1).get(l-1)) {  
             TreeNode root = new TreeNode(k+1);  
             root.right = right;  
             trees.add(root);  
           }  
         } else if (k == i+l) {  
           for (TreeNode left : allNumTrees.get(i).get(l-1)) {  
             TreeNode root = new TreeNode(k+1);  
             root.left = left;  
             trees.add(root);  
           }  
         } else {  
           for (TreeNode left : allNumTrees.get(i).get(k-i-1)) {  
             for (TreeNode right : allNumTrees.get(k+1).get(i+l-k-1)) {  
               TreeNode root = new TreeNode(k+1);  
               root.left = left;  
               root.right = right;  
               trees.add(root);  
             }  
           }  
         }  
       }  
       numTrees.add(trees);  
     }  
   }  
   
   return allNumTrees.get(0).get(n-1);  
 }  
	

	
}
