package array;

public class RotateMatrix {
	
	public static void rotate(int[][] matrix) {
		int n = matrix.length;
		//transposing
		for(int i = 0; i < n; i++) {
			for(int j = i+1; j < n; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
		
		//reversing each row of matrix
		for(int i = 0; i < n; i++) {
			reverse(matrix[i], 0, n-1);
		}
	}
	
	public static void reverse(int[] arr, int si, int ei) {
		while(si<ei) {
			int temp = arr[si];
			arr[si] = arr[ei];
			arr[ei] = temp;
			si++;
			ei--;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] matrix  = {{5,1,9,11} , {2,4,8,10} , {13,3,6,7} , {15,14,12,16}};
		rotate(matrix);
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
