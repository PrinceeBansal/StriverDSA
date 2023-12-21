package binarySearch;

import java.util.Arrays;

public class MedianInARowWiseSortedMatrix {
	
	//brute force time: 0(mn*log(mn)), space: 0(mn), 1 test case failed
	public static int findMedian(int matrix[][], int m, int n) {
		int[] arr = new int[m*n];
		int length = arr.length;
		
		int k = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr[k] = matrix[i][j];
				k++;
			}
		}
		
		Arrays.sort(arr);
		if(length%2 == 0) {
			return arr[(length/2)-1];
		}
		else {
			return arr[length/2];
		}
 	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
