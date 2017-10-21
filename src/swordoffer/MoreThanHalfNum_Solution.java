package swordoffer;

public class MoreThanHalfNum_Solution {
	public static void main(String[] args){
		int[] array = {1,2,3,2,4,2,5,2,3};
		MoreThanHalfNum_Solution fun = new MoreThanHalfNum_Solution();
		int temp = fun.moreThanHalfNum_Solution(array);
		System.out.println(temp);
	}
	public int moreThanHalfNum_Solution(int [] array) {
		int len = array.length;
		int i, pos = 0, num = 0;
		for(i = 0; i < len; i++){
			if(num == 0){
				pos = array[i];
				num = 1;
			}else{
				if(pos == array[i]){
					num++;
				}else{
					num--;
				}
			}
		}
		num = 0;
		for(i = 0; i < len; i++){
			if(pos == array[i]){
				num++;
			}
		}
		if(num <= len/2)
			pos = 0;
        return pos;
    }
}
