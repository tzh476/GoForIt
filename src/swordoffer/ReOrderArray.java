package swordoffer;

public class ReOrderArray {
    public void reOrderArray(int [] array) {
    	int len = array.length;
        int[] res = new int[len];
        int pos = 0, i;
        //保存奇数到res中
        for(i = 0; i < len; i++){
        	if(array[i] % 2 == 1){
        		res[pos++] = array[i];
        	}
        }
        //接着保存偶数到res中
        for(i = 0; i < len; i++){
        	if(array[i] % 2 == 0){
        		res[pos++] = array[i];
        	}
        }
        for(i = 0; i < len; i++){
        	array[i] = res[i];
        }
    }
}
