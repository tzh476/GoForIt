package swordoffer;

import java.util.ArrayList;

public class FindNumbersWithSum {
	public static void main(String[] args) {
		new FindNumbersWithSum().FindNumbersWithSum(new int[] {}, 0);
	}

	public ArrayList<Integer> FindNumbersWithSum(int[] array, int sum) {
		ArrayList<Integer> res = new ArrayList<Integer>();
		if (array == null)
			return null;
		int start = 0, end = array.length - 1;
		if (array.length == 0)
			return res;

		int i, j, move_sum;
		for (i = start, j = end; i < j;) {
			move_sum = array[i] + array[j];
			if (move_sum == sum) {
				res.add(array[i]);
				res.add(array[j]);
				break;
			} else if (move_sum > sum) {
				j--;
			} else {
				i++;
			}
		}

		return res;

	}
}
