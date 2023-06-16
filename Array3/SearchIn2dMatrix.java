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
	
	
	//Optimal
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

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
