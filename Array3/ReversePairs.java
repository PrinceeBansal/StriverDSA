package array3;

public class ReversePairs {
	
	//brute force 0(n^2)
	 public static int reversePairs(int[] nums) {
		 int ans = 0;
		 
		 for(int i = 0; i < nums.length; i++) {
			 for(int j = i+1; j < nums.length; j++) {
				 if(nums[i] > 2l*nums[j]) {  //added 'l' to convert to long
					 ans++;
				 }
			 }
		 }
		 
		 return ans;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {2,4,3,5,1};
		System.out.println(reversePairs(nums));

	}

}
