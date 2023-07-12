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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
