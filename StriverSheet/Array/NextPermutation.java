package array;

public class NextPermutation {
	
	public void nextPermutation(int[] nums) {
		int n = nums.length;
		int breakIndex = -1;
		for(int i = n-2; i >= 0; i--) {
			if(nums[i+1]>nums[i]) {
				breakIndex = i;
				break;
			}
		}
		
		if(breakIndex==-1) {
			reverse(nums,0,n-1);
			return;
		}
		
		for(int i = n-1; i > breakIndex; i--) {
			if(nums[i]>nums[breakIndex]) {
				int temp = nums[breakIndex];
				nums[breakIndex] = nums[i];
				nums[i] = temp;
				break;
			}
		}
		
		reverse(nums, breakIndex+1, n-1);
	}
	
	public void reverse(int[] arr, int si, int ei) {
		while(si < ei) {
			int temp = arr[ei];
			arr [ei] = arr[si];
			arr[si] = temp;
			
			si++;
			ei--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
