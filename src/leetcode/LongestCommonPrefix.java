package leetcode;

import java.util.Arrays;
/**
 * 对字符串排序，假如几个字符串前缀相同，那么他们肯定是各自相邻的，
 * 第一个和最后一个的“部分前缀”相同就是保证了所有的字符串都有这样的前缀
 * 所以比较第一个和最后的最大前缀即可
 * @author Rail
 *
 */
public class LongestCommonPrefix {
	public static void main(String[] args){
		String[] strs = new String[3];
		strs[0] = "abzc";
		strs[1] = "dabnkcccc";
		strs[2] = "abccc";
		System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
	}
    public String longestCommonPrefix(String[] strs) {
    	if(strs == null || strs.length == 0)
    		return "";
    	Arrays.sort(strs);
    	
    	int len = strs.length;
    	int l = Math.min(strs[0].length(), strs[len - 1].length());
    	int i = 0;
    	for(; i < l; i++){
    		if(strs[0].charAt(i) != strs[len - 1].charAt(i))
    			break;
    	}
    	
		return strs[0].substring(0,i);
        
    }
}
