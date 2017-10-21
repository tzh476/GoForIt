package leetcode.other;

public class SortColors {
	/**
	 * 思路：记录0和1的个数a和b，然后给A数组中前a个赋值0，接着的b个赋值1，剩下赋值2
	 */
    public void sortColors(int[] A) {
    	int len = A.length;
        int zero_num = 0;
        int one_num = 0;
        for(int t:A){
        	if(t == 0)
        		zero_num++;
        	if(t == 1)
        		one_num++;
        }
        int i;
        for(i = 0; i < zero_num; i++)
        	A[i] = 0;
        int sum = zero_num + one_num;
        for(; i < sum; i++)
        	A[i] = 1;
        for(;i < len; i++)
        	A[i] = 2;
    }
}
