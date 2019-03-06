	// my version just found the length of the array without duplicates
//	public static int removeDuplicates(int[] nums) {
//
//		int len = nums.length;
//
//		for (int i = 1; i < nums.length; i++) {
//
//			if (nums[i] == nums[i - 1])
//				len -= 1;
//		}
//
//		return len;
//	}

	// the version that LeetCode accepts. It compare the beginning of the arrays. Change the first element with the not duplicated elements and after the length the rest of the array looks like junk.
	public static int removeDuplicates(int[] nums) {

		int i = 0;

		for (int j = 1; j < nums.length; j++) {

			if (nums[i] != nums[j]){
				i++;
				nums[i] = nums[j];
			}
				
		}

		return i + 1;
	}
