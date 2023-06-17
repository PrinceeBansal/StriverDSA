package array3;

public class SearchIn2dMatrix {
	
	//Time - 0(m*n)
	public boolean searchMatrix(int[][] matrix, int target) {
        boolean ans = false;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]==target){
                    ans = true;
                    return ans;
                }
            }
        }

        return ans;
    }
	
	
	//Better - time 0(m+n)
	public boolean searchMatrix2(int[][] matrix, int target) {
		int i = 0;
		for(; i < matrix.length; i++) {
			if(matrix[i][0] <= target && target <= matrix[i][matrix[i].length-1]) {
				break;
			}
		}
		
		if(i==matrix.length) {return false;}
		
		for(int j = 0; j < matrix[i].length; j++) {
			if(matrix[i][j]==target) {
				return true;
			}
		}
		
		return false;
	}
	
	
	//optimal - time 0(log(m*n))
	public boolean searchMatrix3(int[][] matrix, int target) {
		int m = matrix.length;
		int n = matrix[0].length;
		int start = 0;
		int end = (m*n)-1;
		
		while(start<=end) {
			
			int mid = (start+end)/2;  //this line creating problem when input is [[1,1]], index out of bound
			
			if(matrix[mid/m][mid%m]==target) {
				return true;
			}
			else if(matrix[mid/m][mid%m]>target) {
				end = mid-1;
			}
			else if(matrix[mid/m][mid%m]<target) {
				start = mid +1;
			}
			
		}
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
