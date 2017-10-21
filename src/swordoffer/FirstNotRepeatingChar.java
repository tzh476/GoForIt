package swordoffer;

public class FirstNotRepeatingChar {
	public static void main(String[] args){
		System.out.println(new FirstNotRepeatingChar().FirstNotRepeatingChar("")); 
	}
	public int FirstNotRepeatingChar(String str) {
		if(str == null || str == "" || str.isEmpty())
			return -1;
		char[] ss = str.toCharArray();
		int[] count = new int[256];//记录字母出现的数目
		int i;
		for(i = 'a'; i <= 'z'; i++)
			count[i] = 0;
		for(i = 'A'; i <= 'A'; i++)
			count[i] = 0;
		for(i = 0; i < ss.length; i++){
			count[ss[i]]++;
		}
		
		for(i = 0; i < ss.length; i++){
			if(count[ss[i]] == 1){
				break;
			}
		}
        return i;
    }
}
