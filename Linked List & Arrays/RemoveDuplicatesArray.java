package linkedList_Arrays;

public class RemoveDuplicatesArray {
	
	//
	 public int removeDuplicates(int[] nums) {
		 if(nums.length==1) {return 1;}
		 int i = 0 , j = 0;
		 
		 while(i<nums.length && j<nums.length) {
			 if(nums[i]==nums[j]) {
				 j++;
			 }
			 else {
				 int temp = nums[j];
				 nums[j] = nums[i+1];
				 nums[i+1] = temp;
				 i++;
				 j++;
			 }
		 }
		 
		 return i+1;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
