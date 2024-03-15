package binarySearch;

public class MedianOf2SortedArrays {
	
	//Brute force time - 0(m+n)  space - 0(m+n)
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double median = Integer.MIN_VALUE;
		int i=0 , j=0, k=0;     
		int[] arr = new int[nums1.length+nums2.length];
		
		while(i<nums1.length && j<nums2.length) {
			if(nums1[i]<=nums2[j]) {
				arr[k] = nums1[i];
				k++;
				i++;
			}
			else {
				arr[k] = nums2[j];
				k++;
				j++;
			}
		}
		
		if(i==nums1.length && j<nums2.length) {
			while(j<nums2.length) {
				arr[k] = nums2[j];
				j++; k++;
			}
		}
		else if(j==nums2.length && i<nums1.length) {
			while(i<nums1.length) {
				arr[k] = nums1[i];
				k++; i++;
			}
		}
		
		if(arr.length%2!=0) {
			median = arr[(0+(arr.length-1))/2];
			return median;
		}
		else {
			int a = arr[arr.length/2];
			int b = arr[arr.length/2 -1];
			median = (a+b)/2.0;
			return median;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
