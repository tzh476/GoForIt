package swordoffer;

public class MinNumberInRotateArray {
	public static void main(String[] args){
		System.out.println(new MinNumberInRotateArray().minNumberInRotateArray(new int[]{2,3,1}));
	}
    public int minNumberInRotateArray(int [] array) {
    	  
    	  if(array == null || array.length == 0){
    		  return 0;
    	  }
    	  if(array.length == 1)
    		  return array[0];
    	  int i;
          for(i = 0; i < array.length - 1; i++){
        	  if(array[i+1] - array [i] < 0){
        		  break;
        	  }
          }
        	  
          return array[i+1];
    }
          
}
