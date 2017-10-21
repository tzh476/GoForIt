package swordoffer;

public class Multiply {
	public static void main(String[] args){
		int[] A = {1,2,3,4,5};
		Multiply m = new Multiply();
		int[] B  = m.multiply(A);
		for(int i = 0; i < B.length; i++){
			System.out.print(B[i]+" ");
		}
	}
	    public int[] multiply(int[] A) {
	    	int len = A.length;
			int[] B = new int[len];
			int[] C = new int[len];
			
			int i;
			B[0] = 1;
			for(i = 0; i < len - 1; i++){
				B[i+1] = B[i] * A[i];
			}
			C[len - 1] = 1;
			for(i = len - 2; i >= 0; i--){
				C[i] = C[i+1] * A[i+1]; 
				B[i] = B[i] * C[i];
			}
			
			return B;
	    }
}
