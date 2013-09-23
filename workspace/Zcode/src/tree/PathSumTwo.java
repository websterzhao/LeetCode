package tree;

import java.util.ArrayList;

import anode.TreeNode;



public class PathSumTwo {
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
          ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
          if(root==null) return ret;
          ArrayList<Integer> path = new ArrayList<Integer>();
          checkPath(root, sum, ret, path);
          return ret;
    }

	@SuppressWarnings("unchecked")
	private void checkPath(TreeNode root, int sum, ArrayList<ArrayList<Integer>> ret, ArrayList<Integer> path) {
		if(root==null)
			return;
		if(root.val==sum&&root.left==null&&root.right==null){
			path.add(root.val);
			ret.add((ArrayList<Integer>) path.clone());         //非常重要，需要用Clone
			return;
		}
		
		path.add(root.val);
		if(root.left!=null){
			checkPath(root.left, sum-root.val, ret, path);        //pop up last one
			path.remove(path.size()-1);
		}
		if(root.right!=null){
			checkPath(root.right, sum-root.val, ret, path);
			path.remove(path.size()-1);
		}	
		
	}

}