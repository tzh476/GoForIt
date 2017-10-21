package leetcode.search;

public class SearchInsert {
	/**
	 * 二分查找
	 */
    public int searchInsert(int[] A, int target) {
    	if(A == null || A.length == 0)
    		return 0;
    	int left = 0, right = A.length - 1;
    	int mid = 0;
    	while(left <= right){
    		mid = (left + right) >> 1;
    		if(A[mid] == target)
    			return mid;
    		if(A[mid] > target){
    			right = mid - 1;
    		}else{
    			left = mid + 1;
    		}
    	}
    	//可以改进为直接返回left
    	int res = 0;
    	if(A[mid] > target)
    		res = mid;
    	else
    		res = mid + 1;
    	return res;
    }
}
