package binarySearch;

public class SingleElementInASortedArray {
	
	//Brute Force time: 0(n)
	 public int singleNonDuplicate(int[] nums) {
		 if(nums.length==1) {
			 return nums[0];
		 }
		 
		 int n = nums.length;
		 for(int i = 0, j = i+1; i < n-1;) {
			 if(nums[i]==nums[j]) {
				 i++; j++;
			 }
			 else {
				 if(i==0) {
					 return nums[i];
				 }
				 else if(j<n-1 && nums[j]==nums[j+1]) {
					 i++; j++;
				 }
				 else {
					 return nums[j];
				 }
			 }
		 }
		 
		 return Integer.MIN_VALUE;
	 }
	 
	 
	 //optimized approach 0(log n) binary search
	 public int singleNonDuplicate2(int[] nums) {
		 int n = nums.length;
		 if(nums.length==1 || nums[0]!=nums[1]) {return nums[0];}
		 if(nums[n-1]!=nums[n-2]) {return nums[n-1];}
		 
		 int high = n-1, low = 0;
		 while(low<=high) {
			 int mid = (low+high)/2;
			 
			 if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]) {
				 return nums[mid];
			 }
			 
			 if(mid%2==0 && nums[mid]==nums[mid-1]) {high = mid-1;}
			 if(mid%2==0 && nums[mid]==nums[mid+1]) {low = mid+1;}
			 if(mid%2!=0 && nums[mid]==nums[mid-1]) {low = mid+1;}
			 if(mid%2!=0 && nums[mid]==nums[mid+1]) {high = mid-1;}
		 }
		 
		 return Integer.MIN_VALUE;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
