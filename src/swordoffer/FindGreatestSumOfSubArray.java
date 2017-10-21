package swordoffer;

public class FindGreatestSumOfSubArray {

	public static void main(String[] args) {
		int[] array = {6,-3,-2,7,-15,1,2,2};
		
		FindGreatestSumOfSubArray fun = new FindGreatestSumOfSubArray();
		int max = fun.findGreatestSumOfSubArray(array);
		System.out.println(max);
	}
	
	public int findGreatestSumOfSubArray(int[] array) {
		int max_sum = origin_dp(array);
		return max_sum;
        
    }

	/**
	 * 以 第i个元素结尾的子串和 的最大值记为 f[i],f[i] = max{f[i-1]+array[i],array[i]}
	 * (第一个元素结尾时i为0)
	 * @param array
	 * @return
	 */
	private int origin_dp(int[] array) {
		int len = array.length;
		int[] f = new int[len];
		f[0] = array[0];
		int i;
		//求得 以第i个元素结尾的子串和 的最大值数组 f[i]
		for( i = 1; i < len; i++){
			int temp1 = f[i-1] + array[i];
			int temp2 = array[i];
			f[i] = temp1 > temp2 ?temp1:temp2;
		}
		int max = array[0];
		for(i = 0; i < len; i++){
			if(max < f[i])
				max = f[i];
		}
		
		return max;
	}
	
	/**
	 * 以 第i个元素结尾的子串和 的最大值记为 f[i],f[i] = max{f[i-1]+array[i],array[i]}
	 * (第一个元素结尾时i为0)
	 * @param array
	 * @return
	 */
	private int improve_dp(int[] array) {
		int len = array.length;
		int this_sum = array[0];
		int max_sum = array[0];
		int i;
		//求得 以第i个元素结尾的子串和 的最大值数组 f[i]
		for( i = 1; i < len; i++){
			this_sum += array[i];
			if(max_sum <this_sum)
				max_sum = this_sum;
		}
		
		
		return max_sum;
	}
	

}
