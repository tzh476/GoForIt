package leetcode;
/**
 * 思路：存在1,2,3...i...n序列；
 * 以第i个元素为根节点的的二叉树数目 = 左子树可以组成的二叉树数目 + 右子树可以组成的二叉排序树数目
 * 下面列出了递归和非递归实现。递归为了避免重复计算“子问题”，也引进了保存数组
 * @author Rail
 *
 */
public class NumTrees {
	
	public static void main(String[] args){
		NumTrees test = new NumTrees();
		System.out.println(test.numTrees(2));
	}
	int[] arr;
    /**
     * 递归
     * @param n
     * @return
     *//*
	public int numTrees(int n) {
    	arr = new int[n];
    	arr[0] = 1;
    	for(int i = 1; i < n; i++){
    		arr[i] = -1;
    	}
    	int res = reverse(n);
        return res;
    }
	private int reverse(int n) {
		if(n <= 2)
			return n;
		int res = 0;
		for(int i = 0; i < n; i++){
			if(arr[i] == -1)
				arr[i] = reverse(i );
			if(arr[n - 1 - i] == -1)
				arr[n - 1 - i] = reverse(n - 1 - i);
			res += arr[i] * arr[n - 1 - i];
		}
		return res;
	}*/
	//非递归,由下往上
	public int numTrees(int n) {
		if(n == 0)
			return n;
    	arr = new int[n + 1];
    	arr[0] = 1;

    	int i, j;
    	for( i = 1; i <= n; i++){
    		arr[i] = 0;
    		for(j = 0; j < i; j++ ){
    			arr[i] += arr[j] * arr[i - 1 - j];
    		}
    	}
    	
    	
        return arr[n];
    }
}
