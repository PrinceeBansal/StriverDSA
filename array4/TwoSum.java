package array4;
import java.util.HashMap;

public class TwoSum {
	
	//Brute force - 0(n^2)
	public int[] twoSum(int[] nums, int target) {
		int[] ans = new int[2];
		
		for(int i = 0; i < nums.length; i++) {
			for(int j = i + 1; j < nums.length; j++) {
				if(nums[i] + nums[j] == target) {
					ans[0] = i;
					ans[1] = j;
					return ans;
				}
			}
		}
		
		return ans;
	}
	
	//Better approach - hashmap 0(n) space - 0(n)
	public int[] twoSum2(int[] nums, int target) {
		int[] ans = new int[2];
		ans[0] = Integer.MIN_VALUE;
		ans[1] = Integer.MAX_VALUE;
		HashMap<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		
		for(int i = 0; i < nums.length; i++) {
			int required = target - nums[i];
			
			if(map.containsKey(required)) {
				int v = map.get(required);
				if(v != i) {
					ans[0] = i;
					ans[1] = v;
					return ans;
				}
			}
			
		}
		
		return ans;
	}
	
	//OR
	
	 public static int[] twoSum(int n, int []arr, int target) {
	        int[] ans = new int[2];
	        ans[0] = ans[1] = -1;
	        HashMap<Integer, Integer> mpp = new HashMap<>();
	        for (int i = 0; i < n; i++) {
	            int num = arr[i];
	            int moreNeeded = target - num;
	            if (mpp.containsKey(moreNeeded)) {
	                ans[0] = mpp.get(moreNeeded);
	                ans[1] = i;
	                return ans;
	            }

	            mpp.put(arr[i], i);
	        }
	        return ans;
	    }
	 
	 
	 
	  
	 //Better time 0(n) + (nlogn) space 0(1)
	 //can't use this 2 pointer approach for this variant of 2 sum problem since indexes of element will
	 //change on sorting and we need to return the indexes so hashing is the best approach for this varianti 
	 public int[] twoSum3(int[] nums, int target) {
		 Arrays.sort(nums);
		 int[] ans = new int[2];
		 int left = 0;
		 int right = nums.length-1;
		 
		 while(left < right) {
			 if(nums[left]+nums[right] > target) {
				 right--;
			 }
			 else if(nums[left]+nums[right] < target) {
				 left++;
			 }
			 else {
				 ans[0] = left;
				 ans[1] = right;
				 return ans;
			 }
		 }
		 
		 return ans;
	 }
	 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
