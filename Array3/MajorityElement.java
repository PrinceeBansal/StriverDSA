package array3;
import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
	
	//time - 0(n) , space - (n), time different according to striver
	public static int majorityElement(int[] nums) {
		int n = nums.length;
		HashMap<Integer,Integer> freqMap = new HashMap<>();
		
		for(int i = 0; i < n; i++) {
			if(freqMap.containsKey(nums[i])) {
				int v = freqMap.get(nums[i]);
				freqMap.put(nums[i], v+1);
			}
			
			else {
				freqMap.put(nums[i], 1);
			}
		}
		
		int ans = Integer.MIN_VALUE;
		for(Map.Entry<Integer, Integer> set : freqMap.entrySet()) {
			int v = set.getValue();
			if(v>n/2) {
				 ans = set.getKey();
			}
		}
		
		return ans;
	}
	
	
	//optimal solution - time 0(n), space 0(1)
	public static int majorityElement2(int[] nums) {
		int n = nums.length;
		int element = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(count==0) {
				element = nums[i];
			}
			
			if(element==nums[i]) {
				count++;
			}
			else {
				count--;
			}
		}
		
		return element;
	} 
	
	
	//updated version of optimal soln if there are test cases where we don't have majority element
	public static int potentialElement(int[] nums) {
		int n = nums.length;
		int element = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i = 0; i < n; i++) {
			if(count==0) {
				element = nums[i];   //this soln only works if we have to find element
			}                        //whose frequency > n/2 otherwise will give incorrect ans
			
			if(element==nums[i]) {
				count++;
			}
			else {
				count--;
			}
		}
		
		return element;
	}
	
	public static int majorityElement3(int[] nums) {
		int element = potentialElement(nums);
		int frequency = 0;
		
		//now traverse and see whether actually frequency > n/2
		for(int i = 0; i < nums.length; i++) {
			if(nums[i]==element) {
				frequency++;
			}
		}
		
		if(frequency > nums.length/2) {
			return element;
		}
		else {
			return Integer.MIN_VALUE;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,2,3};
		System.out.println(majorityElement(arr));

	}

}
