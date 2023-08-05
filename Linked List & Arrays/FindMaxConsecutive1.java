package linkedList_Arrays;

public class FindMaxConsecutive1 {
	
	//
	public int findMaxConsecutiveOnes(int[] nums) {
		int noConsecutive = 0;
		int maxConsecutive = 0;
		int i = 0, j = 0;
		
		while(i<nums.length && j<nums.length) {
			if(nums[i]==1 && nums[i]==nums[j]) {
				noConsecutive++;
				j++;
				maxConsecutive = Math.max(maxConsecutive, noConsecutive);
			}
			else {
				j++;
				i=j;
				noConsecutive = 0;
			}
		}
		
		return maxConsecutive;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
