package array;

public class SetMatrix0 {
	
	//Soln with 160/166 test cases passed, T - 0(n^3) , space - const
	
	public void setZeroes(int[][] matrix) {
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]==0){
                    matrix[i][j] = Integer.MIN_VALUE;
                }
            }
        }

        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                if(matrix[i][j]==Integer.MIN_VALUE){
                    matrix[i][j] = 0;
                    setZeroesHelper(matrix,i,j);
                }
            }
        }
    }


    public void setZeroesHelper(int[][] matrix, int row, int col){
        for(int j = col; j >= 0; j--){
            if(matrix[row][j]!=Integer.MIN_VALUE){
                matrix[row][j] = 0;
            }
        }

        for(int j = col; j < matrix[row].length; j++){
            if(matrix[row][j]!=Integer.MIN_VALUE){
                matrix[row][j] = 0;
            }
        }

        for(int i = row; i >= 0; i--){
            if(matrix[i][col]!=Integer.MIN_VALUE){
                matrix[i][col] = 0;
            }
        }

        for(int i = row; i < matrix.length; i++){
            if(matrix[i][col]!=Integer.MIN_VALUE){
                matrix[i][col] = 0;
            }
        }
    }
    
    
    
    //Better soln in nbk

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
