package swordoffer;

public class Codec {

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
    	int len = longUrl.length();
    	char[] shortUrl = new char[len];
    	char[] temp = longUrl.toCharArray();
    	for(int i = 0; i < len; i++){
    		shortUrl[i] = (char) (temp[i] + '0');
    	}
    	//shortUrl.toString();
        return shortUrl.toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
    	int len = shortUrl.length();
    	char[] longUrl = new char[len];
    	char[] temp = shortUrl.toCharArray();
    	for(int i = 0; i < len; i++){
    		longUrl[i] = (char) (temp[i] - '0');
    	}
        return longUrl.toString();
    }
    public static void main(String[] args){
    	String url = "https://leetcode.com/problems/design-tinyurl";
    	Codec codec = new Codec();
    	codec.decode(codec.encode(url));
    	System.out.println(codec.encode(url));
    	System.out.println(codec.decode(codec.encode(url)));
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));