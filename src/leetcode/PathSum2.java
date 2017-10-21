package leetcode;

import java.util.ArrayList;
import java.util.List;

public class PathSum2 {
	private ArrayList<ArrayList<Integer>> res = new ArrayList<ArrayList<Integer>>();
	
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
    	List<Integer> cur = new ArrayList<Integer>();
        preOrder(root, cur,  sum,  0);
    	return res;
    }

	private void preOrder(TreeNode root, List<Integer> cur, int sum, int pathsum) {
		if(root == null)
			return ;
		pathsum += root.val;
		cur.add(root.val);
		if(root.left == null && root.right == null && sum == pathsum){
			res.add(new ArrayList<Integer>(cur));
		}
		preOrder(root.left, cur, sum, pathsum);
		preOrder(root.right, cur, sum, pathsum);
		cur.remove(cur.size() - 1);
		
	}
}	
