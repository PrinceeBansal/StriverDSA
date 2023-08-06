package linkedList_Arrays;

public class TrappingRainWater {
	
	//Brute force - 0(N^2) space const TLE
	public int trap(int[] height) {
		int waterStored = 0;
		
		for(int i = 0; i < height.length; i++) {
			
			int maxLeft = 0;
			for(int j = i; j >= 0; j--) {
				if(height[j] > maxLeft) {
					maxLeft = height[j];
				}
			}
			
			int maxRight = 0;
			for(int j = i; j < height.length; j++) {
				if(height[j] > maxRight) {
					maxRight = height[j];
				}
			}
			
			waterStored += Math.min(maxLeft, maxRight) - height[i];  //no need to use absolute because it will never go into negative
		}
		
		return waterStored;
	}
	
	
	//Better - space 0(N) time (N)
	public int trap2(int[] height) {
		int[] prefix = new int[height.length];
		int[] suffix = new int[height.length];
		int waterStored = 0;
		
		prefix[0] = height[0];
		for(int i = 1; i < prefix.length; i++) {
			prefix[i] = Math.max(prefix[i-1], height[i]);
		}
		
		suffix[suffix.length-1] = height[height.length-1];
		for(int i = suffix.length-2; i >= 0; i--) {
			suffix[i] = Math.max(suffix[i+1], height[i]);
		}
		
		for(int i = 0; i < height.length; i++) {
			waterStored += Math.min(prefix[i], suffix[i]) - height[i];
		}
		
		return waterStored;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
