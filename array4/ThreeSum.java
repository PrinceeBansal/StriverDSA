package array4;
import java.util.HashMap;
import java.util.Arrays;
import java.util.ArrayList;

public class ThreeSum {
	
	//Better - does not return distinct triplets
	public static ArrayList<ArrayList<Integer>> threeSum(int[] nums, int target, int n) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		
		for(int i = 0; i < n-2; i++) {
			HashMap<Integer,Integer> map = new HashMap<>();
			for(int j = i+1; j < n-1; j++) {
				int needed = target - nums[i] - nums[j];
				if(map.containsKey(needed)) {
					ArrayList<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(needed);
					ans.add(temp);
				}
				map.put(nums[j], 1);
			}
		}
		
		return ans;
	}


	
	//optimal
	//target = 0;
	public static ArrayList<ArrayList<Integer>> threeSum(int[] nums, int n) {
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		Arrays.sort(nums);
		
		for(int i = 0; i < n-2; i++) {
			
			if(i==0 || (i>0 && nums[i] != nums[i-1]) ){
				int lo = i+1;
				int hi = n-1;
				int needed = 0 - nums[i];
				
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
