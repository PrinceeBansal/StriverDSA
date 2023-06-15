package array2;

public class MergeSortedArray {
	
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		if(n==0){return;}
		if(m==0){
			for(int k = 0; k<n; k++){
				nums1[k] = nums2[k];
			}
			return;
		} 
		
		int lastIndex = m+n-1;
		int i = m-1;
		int j = n-1;
		
		while(j>=0) {
			if(i>=0 && nums1[i] > nums2[j]) {
				nums1[lastIndex] = nums1[i];
				i--;
				lastIndex--;
			}
			
			else {
				nums1[lastIndex] = nums2[j];
				j--;
				lastIndex--;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1 = {1,2,3,0,0,0};
		int[] nums2 = {2,5,6};
		
		merge(nums1, 3, nums2, 3);
		for(int i = 0 ; i < nums1.length; i++) {
			System.out.print(nums1[i] + " ");
		}

	}

}
