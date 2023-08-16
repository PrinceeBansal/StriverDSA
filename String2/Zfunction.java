package string2;

public class Zfunction {
	
	//
	public static int strStr(String haystack, String needle) {
		if(needle.length() > haystack.length()) {
			return -1;
		}
		int ans = -1;
		
		int j = 0;
		for(int i = 0; i < haystack.length();) {
			
			if(j<needle.length() && needle.charAt(j)==haystack.charAt(i)) {
				if(j==0) {ans = i;}
				j++;
				i++;
				if(j==needle.length()) {
					return ans;
				}
			}
			else {
				if(ans!=-1) {i = ans + 1;}
                else{i++;}
				ans = -1;
				j = 0;
			}
			
		}
		
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("mississippi","issipi"));

	}

}
