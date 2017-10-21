package swordoffer;

public class Fibonacci {
	public int fibonacci(int n) {
		if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        return fibonacci(n-1)+fibonacci(n-2);
    }
	public int fibonacci2(int n) {
		if(n == 0)
            return 0;
        if(n == 1)
            return 1;
        int res = 0;
        int temp1 = 0;
        int temp2 = 1;
        while(n-2 >= 0){
        	res = temp1 + temp2;
        	temp1 = temp2;
        	temp2 = res;
        	n--;
        }
        return res;
    }
}
