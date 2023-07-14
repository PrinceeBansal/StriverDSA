package array4;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class FourSum {
	
	//not doing hashing approach confused about it
	 public List<List<Integer>> fourSum(int[] nums, int target){
		 Arrays.sort(nums);
		 int n = nums.length;
		 List<List<Integer>> ans = new ArrayList<>();
		 
		 for(int i = 0; i < n-3; i++) {
			 if(i>0 && nums[i]==nums[i-1]) {continue;}
			 //if(i==0 || nums[i]!=nums[i-1]) {}
			 
			 for(int j = i+1; j < n-2; j++) {
				 //if(j==i+1 || nums[j]!=nums[j-1]) {}
				 if(j>i+1 && nums[j]==nums[j-1]) {continue;}
				 
				 int lo = j+1, hi = n-1;
				 int needed = target - nums[i] - nums[j];   //here do something about integer overflow
				 while(lo < hi) {
					 if(nums[lo] + nums[hi] > needed) {
						 hi--;
					 }
					 else if(nums[lo] + nums[hi] < needed) {
						 lo++;
					 }
					 else {
						 ArrayList<Integer> temp = new ArrayList<>();
						 temp.add(nums[i]);
						 temp.add(nums[j]);
						 temp.add(nums[lo]);
						 temp.add(nums[hi]);
						 ans.add(temp);
						 
						 while(lo<hi && nums[lo]==nums[lo+1]) {lo++;}
						 while(lo<hi && nums[hi]==nums[hi-1]) {hi--;}
						 lo++;
						 hi--;
					 }
				 }
				 
			 }
			 
		 }
		 
		 return ans;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
