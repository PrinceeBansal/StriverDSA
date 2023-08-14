package string;
import java.util.Stack;

public class ReverseWords {
	
	//
	public static String reverseWords(String s) {
		Stack<String> stack = new Stack<>();
		String word = "";
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i)!=' ' && s.charAt(i)!='\n' && s.charAt(i)!='\t') {
				word = word + s.charAt(i);
			}
			else {
				if(word.length()!=0) {
					stack.push(word);
					word = "";
				}
				else {
					continue;
				}
			}
		}
		
		if(word.length()!=0) {
			stack.push(word);  //because last word will not be stored as i will reach length();
		}
		
		String ans = "";
		while(!stack.isEmpty()) {
			ans = ans + " " + stack.pop();
		}
		
		return ans.trim();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "a good   example";
		System.out.println(reverseWords(s));

	}

}
