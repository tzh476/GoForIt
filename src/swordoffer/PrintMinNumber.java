package swordoffer;

import java.util.Arrays;
import java.util.Comparator;

public class PrintMinNumber {
	public static void main(String[] args){
		PrintMinNumber p = new PrintMinNumber();
		int[] numbers = {3,32,321};
		p.PrintMinNumber(numbers);
	}
	public String PrintMinNumber(int [] numbers) {
		int len = numbers.length;
		int i ; 
		Integer[] a = new Integer[len];
		for(i = 0; i < len; i++)
			a[i] = numbers[i];
		Comparator<Integer> comparator = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				String str1 = o1 + "" + o2;
				String str2 = o2 + "" + o1;
				return str1.compareTo(str2);
			}
		};
		
		Arrays.sort(a,comparator);
		
		StringBuilder sb = new StringBuilder();
		for(i = 0; i < len; i++)
			sb.append(a[i]);
		System.out.println(sb);
		return sb.toString();
    }
}
