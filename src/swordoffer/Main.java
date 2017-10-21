package swordoffer;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		long n1 = sc.nextLong();
		long res = 0;
		long i = (long) 0;
		int j, k;
		char[] temp = null;
		int  end;
		for (i = (long) 0; i <= n1; i++) {
			temp = Long.toBinaryString(i).toCharArray();
			end = temp.length -1;
			boolean f = true;
			for(j = 0, k=end; j < k; j++,k--){
				if(temp[j] != temp[k]){
					f = false;
					break;
				}
			}
			if(f){
				res++;
			}
		}
		System.out.println(res);
		sc.close();
	}
}
