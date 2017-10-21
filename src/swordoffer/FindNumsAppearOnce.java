package swordoffer;

public class FindNumsAppearOnce {
	public static void main(String[] args){
		new FindNumsAppearOnce().FindNumsAppearOnce(new int[]{3,3,6,5,4,4},new int[1],new int[1]); 
	}
	public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int len = array.length;
        int i;
        int sum = 0;//任何数与0异或操作都为0，故初始化为0
        for(i = 0; i < len; i++){
        	sum ^= array[i];
        }
        
        //任意两个相同的数异或为0，所以 数组的两个不同的数 异或操作得到的值为sum，sum一定不为零
        int temp = 1;
        int pos = 1;//用于标记sum的哪一位为1
        while((sum & temp) != 1){
        	sum = sum >> 1;
        	pos = pos << 1;
        }
        num1[0] = 0;
        num2[0] = 0;
        //根据pos将数组分为两部分，两个不同的数肯定在不同的数组中
        for(i = 0; i < len; i++){
        	if((array[i] & pos) == 0)
        		num1[0] ^= array[i];
        	else
        		num2[0] ^= array[i];
        }
      //  System.out.println(num1[0]+" "+num2[0]);
    }
}	
