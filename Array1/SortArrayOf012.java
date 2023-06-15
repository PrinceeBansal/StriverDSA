package array;

public class SortArrayOf012 {
	
	public void sortColors(int[] nums) {
        int countRed = 0;
        int countWhite = 0;
        int countBlue = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i]==0){countRed++;}
            else if(nums[i]==1){countWhite++;}
            else if(nums[i]==2){countBlue++;}
        }
        
        int i = 0;
        for(; i < countRed; i++){
            nums[i] = 0;
        }

        for(; i < countRed + countWhite; i++){
            nums[i] = 1;
        }

        for(; i < countRed + countWhite + countBlue; i++){
            nums[i] = 2;
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
