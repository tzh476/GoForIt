package leetcode;

public class ArrayToBST {

		TreeNode root = null;
	    public TreeNode sortedArrayToBST(int[] num) {
	        int start = 0;
	        int end = num.length - 1;
	        binary(num, start, end);
	        return root;
	    }

	private static void binary(int[] num, int start, int end) {
		
	}

}
