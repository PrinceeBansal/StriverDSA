package array3;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MajorityElement2 {
	
	//Time - 0(n) space - 0(n)
	//list uses v little space so almost constant
	public static List<Integer> majorityElement(int[] nums){
		int n = nums.length;
		List<Integer> ans = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			if(map.containsKey(nums[i])) {
				int value = map.get(nums[i]);
				map.put(nums[i], value+1);
			}
			
			else {
				map.put(nums[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> set : map.entrySet()) {
			int value = set.getValue();
			if(value > n/3) {
				ans.add(set.getKey());
			}
		}
		
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
