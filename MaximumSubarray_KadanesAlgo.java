// LeetCode #53

class Solution {
    public int maxSubArray(int[] nums) {
        
        int maxSoFar = nums[0];
		int maxEndingHere = 0;

		for (int i = 0; i < nums.length; i++) {

			maxEndingHere = maxEndingHere + nums[i];

            if (maxSoFar < maxEndingHere)
				maxSoFar = maxEndingHere;
            
			if (maxEndingHere < 0)
				maxEndingHere = 0;

			
		}

		return maxSoFar;
    }
}
