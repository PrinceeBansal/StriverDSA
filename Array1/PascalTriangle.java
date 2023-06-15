package array;
import java.util.ArrayList;
import java.util.List;


public class PascalTriangle {
	
	public List<List<Integer>> generate(int numRows){
		if(numRows==0) {return null;}
		
		List<List<Integer>> ans  = new ArrayList<>();  //careful here can't write "List" after new
		ArrayList<Integer> prev  = new ArrayList<>();
		prev.add(1);
		ans.add(prev);
		
		for(int i = 1; i < numRows; i++) {
			ArrayList<Integer> current = new ArrayList<>();
			//adding first 1
			current.add(1);
			
			//adding middle elements
			for(int j = 0; j < prev.size()-1; j++) {
				int sum = prev.get(j) + prev.get(j+1);
				current.add(sum);
			}
			
			//adding last 1
			current.add(1);
			
			ans.add(current);
			prev = current;
		}
		
		return ans;
		
	}
	

	public static void main(String[] args) {
		
		
		
	}
}


