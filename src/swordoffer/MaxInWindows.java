package swordoffer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;


/**
 * 链接：https://www.nowcoder.com/questionTerminal/1624bc35a45c42c0bc17d17fa0cba788
来源：牛客网
 * 题目：滑动窗口的最大值
 * 思路：滑动窗口应当是队列，但为了得到滑动窗口的最大值，队列序可以从两端删除元素，因此使用双端队列。
 *     原则：
 *     对新来的元素k，将其与双端队列中的元素相比较
 *     1）前面比k小的，直接移出队列（因为不再可能成为后面滑动窗口的最大值了!）,
 *     2）前面比k大的X，比较两者下标，判断X是否已不在窗口之内，不在了，直接移出队列
 *     队列的第一个元素是滑动窗口中的最大值
 */
public class MaxInWindows {
	//[2,3,4,2,6,2,5,1],3
	public static void main(String[] args){
		ArrayList<Integer> res = new MaxInWindows().maxInWindows(new int[]{16,14,12,10,8,6,4}, 5);
		for (Iterator iterator = res.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			System.out.println(integer);
		}
	}
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	int len = num.length;
    	if(num == null || len == 0 || size == 0 || size > len)
    		return res;
    	Map<String, Integer> map = getMax(num, 0, size - 1);
    	res.add(map.get("first_value"));
    	System.out.println(map.get("first_index")+" "+map.get("first_value"));
    	for(int i = size; i < len ; i++){
    		if(num[i] >= map.get("first_value")){
    			res.add(num[i]);
    			map.put("first_index", i);
    			map.put("first_value", num[i]);
    		}else {
    			if(num[i-size] != map.get("first_value")){//最大值不是将要滑走的元素，即第一个元素
    				res.add(map.get("first_value"));
    			}else{
    				map = getMax(num, i - size + 1, i);
    				res.add(map.get("first_value"));
    			}
    		}
    		System.out.println(map.get("first_index")+" "+map.get("first_value"));
    	}
    	
    	return res;
    }
    
    //获得最大值
    private Map<String,Integer> getMax(int[] num, int start, int end){
    	Map<String,Integer> map = new HashMap<String, Integer>();
    	int i, first_value = num[start], first_index = 0;
    	//获得最大值
    	for(i = start; i <= end; i++){
    		if(num[i] > first_value){
    			first_index = i;
    			first_value = num[i];
    		}
    	}
    	
    	map.put("first_index", first_index);
    	map.put("first_value", first_value);
		
    	return map;
    }
}	
