package leetcode;

import java.util.HashMap;
import java.util.Map;
/**
 * 用map保存 （value，index），然后遍历，当前遍历下标记做i：
 *   如果 i对应的值 + map中一个value = target，即 map的key 包括target -  （i对应的值），则找到结果
 *   否则 保存map保存 （i对应的值，i）
 * @author Rail
 *
 */
public class TwoSum {
	public static void main(String[] args){
		TwoSum t = new TwoSum();
		int[] res= t.twoSum(new int[]{3,2,4}, 6);
		
	}
	
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> map = new HashMap<Integer,Integer>();
        int len = numbers.length;
        int[] index = new int[2];
        for(int i = 0; i < len; i++){
        	if(!map.containsKey(target - numbers[i])){
        		map.put(numbers[i], i);
        	}else{
        		index[0] = map.get(target - numbers[i]) + 1;
        		index[1] = i + 1;
        		break;
        	}
        }
        return index;
    }
}
