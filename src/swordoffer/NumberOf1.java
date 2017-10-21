package swordoffer;

public class NumberOf1 {

	public static void main(String[] args) {
		System.out.println(new NumberOf1().NumberOf1(-2));

	}
    public int NumberOf1(int n) {
    	int res = 0;
    	int temp = 1;
    	int i = 0;
    	for(i = 0; i < 32; i++){
    		if((n & 1) == 1)
    			res++;
    		n = n >> 1; 
    	}
    	return res;
    }
    
}
