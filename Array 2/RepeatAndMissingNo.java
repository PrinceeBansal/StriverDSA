package array2;

public class RepeatAndMissingNo {
	
	//uses extra space so optimize
	public int[] repeatedNumber(final int[] A) {
		int n = A.length;
		int[] helper = new int[n+1];
		
		for(int i = 0; i < n; i++) {
			helper[A[i]]++;
		}
		
		int repeat = -1;
		int missing = -1;
		
		for(int i = 1; i<helper.length;i++) {
			if(helper[i]==2) {repeat = i;}
			if(helper[i]==0) {missing = i;}
			
			if(repeat!=-1 && missing!=-1) {break;}
		}
		
		int[] ans = {repeat,missing};
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
