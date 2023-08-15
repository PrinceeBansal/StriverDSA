package string;

public class LongestPalindromicSubstring {
	
	//brute force 0(N^3)
	public static String longestPalindrome(String s) {
		int lengthMax = 0;
		String sub = "";
		String longest = "";
		
		for(int i = 0; i < s.length(); i++) {
			sub = sub + s.charAt(i);
			if(sub.length()>lengthMax) {
				lengthMax = sub.length();
				longest = sub;
			}
			
			for(int j = i+1; j < s.length(); j++) {
				sub = sub + s.charAt(j);
				boolean ans = isPalindrome(sub);
				if(ans && lengthMax<sub.length()) {
					lengthMax = sub.length();
					longest = sub;
				}
			}
			
			sub = "";
		}
		
		return longest;
	} 
	
	public static boolean isPalindrome(String s) {
		int i = 0;
		int j = s.length()-1;
		
		for(; i<=j; i++,j--) {
			if(s.charAt(i)!=s.charAt(j)) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
	//	System.out.println(isPalindrome(""));
		System.out.println(longestPalindrome(""));
	}

}
