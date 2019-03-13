// LeetCode #1

public class Solution {
	
	 public static int[] twoSum(int[] nums, int target) {
	        
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
