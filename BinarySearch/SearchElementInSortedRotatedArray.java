package binarySearch;

public class SearchElementInSortedRotatedArray {
	
	//brute force - linear search 0(n)
	
	
	//optimal - binary search log(n)
	 public int search(int[] nums, int target) {
		 if(nums.length==1) {
			 if(nums[0]==target) {
				 return 0;
			 }
			 else {
				 return -1;
			 }
		 }
		 
		 int low = 0;
		 int high = nums.length-1;
		 
		 while(low<=high) {
			 int mid = (low + high)/2;
			 if(nums[mid]==target) {
				 return mid;
			 }
			 
			 if(nums[low] <= nums[mid]) {
				 if(nums[low]<=target && target<nums[mid]) {  //careful put <= here
					 high = mid-1;
				 }
				 else {
					 low = mid+1;
				 }
			 }
			 
			 else if(nums[mid] <= nums[high]) {
				 if(nums[mid]<target && target<=nums[high]) { //careful put <= here
					 low = mid+1;
				 }
				 else {
					 high = mid-1;
				 }
			 }
		 }
		 
		 return -1;
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
