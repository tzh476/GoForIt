package leetcode.other;
/**
 * 从两个数组的后往前遍历
 */
public class MergeSortedArray {
    public void merge(int A[], int m, int B[], int n) {
        int len = m + n;
        int cur = len - 1;
        int i = m - 1 , j = n - 1;
        while(i >= 0 && j >= 0){
        	if(B[j] > A[i])
        		A[cur--] = B[j--];
        	else
        		A[cur--] = A[i--];
        }
        while(j >= 0)
        	A[cur--] = B[j--];
    }
}
