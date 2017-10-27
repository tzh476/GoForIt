package leetcode;

public class RemoveElement {
	public int removeElement(int[] nums, int val) {
    	if(nums == null)
    		return 0;

    	int len = nums.length;
    	int i, j = 0;
    	boolean isFirst = true;
    	
    	for(i = 0; i < len ; i++){
    		if(nums[i] == val){
    			
    			if(isFirst){
    				j = i + 1;
    				isFirst = false;
    			}
    			
    			for(; j < len; j++){
    				if(nums[j] != val){
                       
    					swap(nums, i, j);
    					break;
    				}
    			}
    		}
    		if(j >= len)
    			break;
    	}
		return i;
        
    }

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i] ;
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
