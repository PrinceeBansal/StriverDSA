package binarySearch;

public class NthRootInteger {
	
	//brute force - linear search 0(mn)
	public static int NthRoot(int n, int m) {
		
		for(int i = 0; i <= m; i++) {
			int val = func(i,n);
			if(val == m) {
				return i;
			}
			else if(val > m) {
				return -1;
			}
		}
		
		return -1;
	}
	
	public static int func(int base, int exp) {
		int ans = 1;  //if we use power exponential method instead of this can improve time complexity
		for(int i = 1; i <= exp; i++) {
			ans = ans*base;
		}
		return ans;
	}
	
	
	
	
	//Binary Search
	public static int NthRoot2(int n, int m) {
		int low = 1;
		int high = m;
		
		while(low<=high) {
			int mid  = (low+high)/2;
			
			if(func2(mid,n,m)==0) {
				return mid;
			}
			else if(func2(mid,n,m)==1) {
				low = mid+1;
			}
			else if(func2(mid,n,m)==2) {
				high = mid-1;
			}
		}
		
		return -1;
	}
	
	//return 0 if match
	//return 1 if < mid
	//return 2 if > mid
	public static long func2(int base, int exp, int m) {
		long ans = 1;
		
		for(int i = 1; i <= exp; i++) {
			ans = ans*base;
			if(ans > m) {   //did this to handle large test cases
				return 2;
			}
		}
		
		if(ans==m) {
			return 0;
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
