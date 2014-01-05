package tree;

import java.util.ArrayList;
import anode.TreeNode;

public class UniqueBSTII {
	public ArrayList<TreeNode> generateTrees(int n) {
        ArrayList<TreeNode> res = new ArrayList<TreeNode>();
        generateTrees(res,1,n);
        return res;                        
    }

    public void generateTrees(ArrayList<TreeNode> res,int left,int right){
            if(left > right)
                    res.add(null);
            else
                    for(int i=left;i<=right;i++){
                            ArrayList<TreeNode> lefts = new ArrayList<TreeNode>();
                            generateTrees(lefts,left,i-1);
                            ArrayList<TreeNode> rights = new ArrayList<TreeNode>();
                            generateTrees(rights,i+1,right);
                            for(int x=0;x<lefts.size();x++)
                                    for(int y=0;y<rights.size();y++){
                                            TreeNode root = new TreeNode(i);
                                            root.left = lefts.get(x);
                                            root.right = rights.get(y);
                                            res.add(root);
                                    }
                    }
    }
}
