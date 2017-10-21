package swordoffer;

public class GetNumberOfK {
	
	public static void main(String[] args){
		int[] array = {1,2,2,3,4,4,4};
		
		System.out.println(new GetNumberOfK().GetNumberOfK(array,4));
	}
	
	public int GetNumberOfK(int [] array , int k) {
		int  first, last;
		first = getFirstPos(array,k);//获得k第一次出现的位置
		if(first == -1)
			return 0;
		last = getLastPos(array,k);//获得k最后一次出现的位置
		//System.out.println(first+" "+last);
	    return last - first + 1;
    }
	
	
	private int getFirstPos(int[] array, int k) {
		int len = array.length;
		int start = 0, end = len - 1;
		int mid = ( start + end ) / 2;
		boolean isExistEqual = false;
		while(start <= end){
			if(array[mid] > k){
				end = mid - 1;
			}else if(array[mid] < k){
				start = mid + 1;
			}else if(array[mid] == k){
				end = mid - 1;
				isExistEqual = true;
			}
			mid = ( start + end ) / 2;
		}
		if(!isExistEqual)
			return -1;
		return start;
	}
	
	private int getLastPos(int[] array, int k) {
		int len = array.length;
		int start = 0, end = len - 1;
		int mid = ( start + end ) / 2;
		boolean isExistEqual = false;
		while(start <= end){
			if(array[mid] > k){
				end = mid - 1;
			}else if(array[mid] < k){
				start = mid + 1;
			}else{
				start = mid + 1;
				isExistEqual = true;
			}
			mid = ( start + end ) / 2;
		}
		if(!isExistEqual){
			return -1;
		}
		return end;
	}

	
}
