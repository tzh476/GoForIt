package swordoffer;

public class LeftRotateString {
	public static void main(String[] args){
		
		System.out.println(new LeftRotateString().LeftRotateString("abcXYZdef", 3));;
	}
    public String LeftRotateString(String str,int n) {
    	if(str == null || str.length() == 0)
    		return str;
    	char[] res = new char[str.length()];
    	int moveLen = n % str.length();
    	char[] ss = str.toCharArray();
    	int j = 0;
    	for(int i = moveLen; i < str.length(); i++){
    		res[j++] = ss[i];
    	}
    	for(int i = 0;i < moveLen; i++){
    		res[j++] = ss[i];
    	}
    	
		return String.valueOf(res);
        
    }
}
