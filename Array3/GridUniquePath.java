package array3;

public class GridUniquePath {
	
	//Recursive soln - time 0(exponential) space also exponential
	//TLE exceeded
	public int uniquePaths(int m, int n) {
		return helper(m,n,0,0);
	}
	
	public int helper(int m, int n, int i, int j) {
		if(i<0 || i>m || j<0|| j>n) {  //no need to write <0 condition as we are passing
			return 0;               //initial value of i and j has 0 itself and its increasing only
		}
		
		if(i==m-1 && j==n-1) {
			return 1;
		}
		
		int bottomPaths = helper(m,n,i+1,j);
		int rightPaths = helper(m,n,i,j+1);
		
		return bottomPaths + rightPaths;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
