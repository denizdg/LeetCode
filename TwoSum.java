import java.util.*;

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] example = {2, 7, 11, 15};
		int[] result = FindSumElements(example , 9);
	}
	
	 public static int[] FindSumElements(int[] nums, int target) {
	        
	        Map<Integer, Integer> seen = new HashMap<Integer, Integer>(); 
	        
	        int[] result = new int[2];
	        
	        for(int i = 0; i < nums.length; i++){
	            
	            if(seen.containsKey(target - nums[i])){
	                
	            	result[0] = seen.get(target - nums[i]);
	                result[1] = i;
	                
	                return result;
	            }
	            seen.put(nums[i], i);
	        }
	               
	        return null;
	        
	    }

}
