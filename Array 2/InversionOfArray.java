package array2;

public class InversionOfArray {
	
	//Time - 0(n^2)
	public static long getInversions(long arr[], int n) {
		long pairs = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                if(arr[j] < arr[i]){
                    pairs++;
                }
            }
        }

        return pairs;
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
