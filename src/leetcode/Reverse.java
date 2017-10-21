package leetcode;

public class Reverse {
	public static void main(String[] args){
		System.out.println(new Reverse().reverse(-90));
	}
    public int reverse(int x) {
        String s = String.valueOf(x);
        int len = s.length();
        char[] res = new char[len];
        int pos = len - 1;
        for(char t:s.toCharArray()){
        	if(x < 0){
        		if(pos == len - 1){
        			res[0] = t;
        			pos--;
        		}else{
        			res[pos+1] = t;
        			pos--;
        		}
        	}else{
        		res[pos--] = t;
        	}
        	
        }
        
        return Integer.valueOf(String.valueOf(res));
    }
}
