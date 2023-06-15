package array;

public class KadaneAlgo {
	
	//0(n^3) solution - 200/210 test cases passed
	public int maxSubArray1(int[] nums) {
		int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i =0; i < n; i++){
        	
            for(int j = i; j < n; j++){
                int sum = 0;
                
                for(int k = i; k <=j; k++) {
                	sum = sum + nums[k];
                	maxSum = Math.max(maxSum, sum);
                }
            }
        }

        return maxSum;
	}
	
	//0(n^2) solution - 204/210 test cases passed
	public int maxSubArray2(int[] nums) {
        int maxSum = Integer.MIN_VALUE;
        int n = nums.length;

        for(int i =0; i < n; i++){
            int currSum = 0;
            for(int j = i; j < n; j++){
                currSum = currSum + nums[j];
                if(currSum > maxSum){maxSum = currSum;}
            }
        }

        return maxSum;
    }
	
	
	//0(n) solution
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
