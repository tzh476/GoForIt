package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutations {
	private ArrayList<ArrayList<Integer>> res;
    public ArrayList<ArrayList<Integer>> permute(int[] num) {
        res = new ArrayList<ArrayList<Integer>>();
        Arrays.asList(num);
        permu(num,0);
        return res;
    }
	private void permu(int[] num, int index) {
		if(num.length - 1 == index){
			ArrayList<Integer> list =new ArrayList<Integer>();
			for(int t:num)
				list.add(t);
			res.add(list);
			return;
		}
		for(int i = index; i < num.length; i++){
			swap(num,index,i);
			permu(num, index+1);
			swap(num,index,i);
		}
	}
	private void swap(int[] num, int index, int i) {
		int t = num[index];
		num[index] = num[i];
		num[i] = t;
	}
}
