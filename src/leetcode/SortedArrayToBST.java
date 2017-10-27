package leetcode;
/**
 * convert-sorted-array-to-binary-search-tree
 * @author Rail
 - 二分查找，注意如果数组的length为偶数，则作为根结点的是右边的元素；
 - 当前根结点的左右子结点分别对应左数组和右数组的中间元素，用递归实现；
 - 时间复杂度为O(n),栈空间复杂度为O（lgn），最后保存的树的空间为O（n），即空间复杂度为O(n)
 */
public class SortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] num) {
    	if(num == null || num.length == 0)
    		return null;
        
        return binary(num,0,num.length - 1);
    }

	private TreeNode binary( int[] num, int start, int end) {
		
		if(end < start)
			return null;
		
		int mid = (end + start + 1) / 2;
		
		TreeNode root = new TreeNode(num[mid]);
		root.left = binary(num, start, mid - 1);
		root.right = binary(num, mid + 1, end);
		return root;
	}

}
