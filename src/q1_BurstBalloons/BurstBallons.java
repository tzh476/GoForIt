package q1_BurstBalloons;

public class BurstBallons {
	public static void main(String args[]){
		int nums[]=new int[]{8,2,6,8,9,8,1,4,1,5,3,0,7,7,0,4,2,2};
		
		System.out.println(maxCoins(nums));
	}
	public static int maxCoins(int[] nums) {
        int len=nums.length;
        int[] a=new int[len+2];
        int[][] record=new int[len+2][len+2];
        a[0]=1;
        a[len+1]=1;
        for(int i=1;i<len+1;i++)
            a[i]=nums[i-1];
        return burst(a,record,0,len+1);
    }
	 static int burst(int[] a,int[][]record, int left, int right) {
		 if(right==left+1) 
			 return 0;
		 if(record[left][right]>0) return record[left][right];
		// if(right==left+2) return a[left+1];

	     for(int i=left+1;i<right;i++){
	        //max=Math.max(max,a[i-1]*a[i]*a[i+1]+burst(a,left,i)+burst(a,i,right));
	    	 record[left][right]=Math.max(record[left][right],a[left]*a[i]*a[right]+burst(a,record,left,i)+burst(a,record,i,right));
	     }
	     return record[left][right];
	}
}
