package array4;
import java.util.*;

public class LongestConsecutiveSequence {
	
	// Time = (nlogn) + (n)
	 public int longestConsecutive(int[] nums) {
		 Arrays.sort(nums);
		 int length = 0;
		 int maxLength = 0;
		 
		 for(int i = 0; i < nums.length; i++) {
			 if(i==0) {
				 length = 1;
			 }
			 else if(nums[i]==nums[i-1]) {
				 continue;
			 }
			 else if(nums[i]==nums[i-1]+1) {
				 length++;
			 }
			 else {
				 if(length > maxLength) {maxLength = length;}
				 length = 1;
			 }
		 }
		 
		 if(length > maxLength) {maxLength = length;}
		 return maxLength;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
