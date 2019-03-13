//  LeetCode #35

class Solution {
    public int searchInsert(int[] nums, int target) {
        
        int possibleIndex = -1;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] == target)
				return i;
			else {
				if(target < nums[0])
					return 0;
				else if(i != nums.length -1  && (nums[i] < target && nums[i + 1] > target))
					possibleIndex = i + 1;
			}

		}
		
		if(possibleIndex == -1)
			possibleIndex = nums.length;

		return possibleIndex;
    }
}
